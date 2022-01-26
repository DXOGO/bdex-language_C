from utils import quickSort
from enums import Order, Type
import inspect
import copy


class Table():
    def __init__(self, name, formulas=None, constraints=None, header=None):
        self.name = name
        self.header = (header if header else {})
        self.rows = []
        self.formulas = (formulas if formulas else {})
        self.constraints = (constraints if constraints else [])

    def add_col(self, col: dict):
        """Add column to table"""
        for c in col.keys():
            formula = None
            if type(col[c]) == type(lambda: None):
                formula = col[c]
                self.header[c] = Type.LAMBDA
            else:
                self.header[c] = col[c]

            if formula:
                self.formulas[c] = formula

            for r in self.rows:
                r.add_col({c: col[c]}, formula)
        return self

    def add(self, values, recalc=True):
        """Insert a row passing values"""
        vals = {}
        if (isinstance(values, tuple)):
            i = 0
            for k in self.header.keys():
                if self.header[k] != Type.LAMBDA:
                    vals[k] = self.header[k].value[0](values[i])
                    i += 1
        else:
            vals = values

        insertrow = Row(self.header, vals, recalc)
        if recalc:
            ret_table = self.clone(True)
            for val in self.header.keys():
                if val in self.formulas.keys():
                    insertrow.alter({val: self.formulas[val](insertrow)})

            passed = True
            for c in self.constraints:
                if not c(insertrow):
                    passed = False

            if passed:
                self.rows.append(insertrow)
                ret_table.add_row(insertrow)

        else:
            ret_table = self.clone(False)
            ret_table.add_row(insertrow)

        return ret_table

    def add_row(self, r):
        """Insert row passing row object"""
        self.rows.append(r)

    def add_batch(self, rows: list):
        """Insert a batch of rows"""
        for r in rows:
            self.add_row(r)

    def setName(self, name):
        self.name = name
        return self

    def alter(self, vals):
        for k in vals.keys():
            for row in self.rows:
                row.alter({k: vals[k]})

        return self

    def select(self, condition):
        """Returns a new table with the columns in col_names"""
        hascols = False
        sub_rows = []
        new_header = self.header

        if (len(self.rows) == 0):
            vals = {}
            [vals.update({r: ""}) for r in self.header.keys()]
            temp = Row(self.header, vals)

            cond = condition(temp)

            if not isinstance(cond, bool):
                new_header = {}
                if not isinstance(cond, tuple):
                    for k in cond.keys():
                        new_header[k] = self.header[k]
                else:
                    for k in cond:
                        new_header[k] = self.header[k]

        for r in self.rows:
            cond = condition(r)
            new_header = self.header
            if (isinstance(cond, bool) and cond):
                sub_rows.append(r)
            elif isinstance(cond, tuple):
                hascols = True
                new_header = {k: self.header[k]
                              for k in self.header if k in cond}
                sub_rows.append(r.sub_row(new_header))

        return SubTable(self, sub_rows, self.rows, self.formulas, self.constraints, new_header, hascols)

    def check(self, constraint):
        self.constraints.append(constraint)
        return self

    def remove(self, col_name: list):
        """Delete a row"""
        clone = self.clone()
        for r in self.rows:
            r.remove(col_name)
        return clone

    def order(self, col: str, order: Order):
        """Sort rows on col with quicksort"""
        rows = self.rows
        quickSort(self.rows, 0, len(rows)-1, col)

        if order == Order.DESC:
            rows.reverse()

        table = self.clone(True)
        for r in rows:
            table.add_row(r.clone())
        return table

    def pop(self, n: int):
        rows = self.rows[:n]
        table = self.clone(True)
        for r in rows:
            table.add_row(r.clone())
        return table

    def clone(self, clear_rows=False, name=None):
        cloned = copy.deepcopy(self)
        cloned.setName(name)
        if clear_rows:
            cloned.delete(True)
        return cloned

    def delete(self, clear=True):
        self.rows = []
        return self

    def __iter__(self):
        return (x for x in self.rows)

    def __str__(self):
        lst = [str(k) for k in self.header.keys()]
        output = ""
        output += ''.join(['%-15s']*len(lst)) % tuple(lst)
        output += '\n'
        for r in self.rows:
            output += str(r)

        return output

    def size(self):
        return len(self.rows)

    def __len__(self) -> int:
        return self.size()

    # *
    def __mul__(self, t2):
        return TableOperator.merge_tables(self, t2)

    # ^
    def __xor__(self, t2):
        return TableOperator.join_tables(self, t2)

    # +
    def __add__(self, t2):
        return TableOperator.clone_tables(self, t2)


class Row():
    def __init__(self, header, values, recalc=True):
        self.header = header
        self.items = {}
        self.sub_rows = []

        """Apply default values"""
        for k in self.header.keys():
            if not recalc:
                self.items[k] = values[k]

            else:
                if values.get(k) and isinstance(values[k], self.header[k].value[0]):
                    self.items[k] = values[k]
                else:
                    self.items[k] = self.header[k].value[1]
        #[self.items.update({k : values[k]}) if values.get(k) and isinstance(values[k], self.header[k]) else self.items.update({k : None}) for k in self.header.keys()]

    def get(self, col_names: list):
        """Returns a new row formed by the columns of col_names"""
        h = {}
        vals = {}
        [h.update({col: self.header[col]}) for col in col_names]
        [vals.update({k: self.items[k]}) for k in h.keys()]
        return Row(h, vals)

    def value(self, col: str):
        """Return the value in column of the this row"""
        return self.items[col]

    def alter(self, values, constraints=None):
        temp = self.items
        for k in values.keys():
            self.items[k] = values[k]

        if constraints:
            passed = True
            for c in constraints:
                if not c(self):
                    passed = False

            if not passed:
                self.items = temp
            return passed

        return True

    def recalc(self, forms):
        for k in forms.keys():
            self.alter({k: forms[k](self)})

    def remove(self, col: list):
        """Change value on columns col to default"""
        for c in col:
            self.items[c] = self.header[c].value[1]

    def add_col(self, col, formula=None):
        for c in col.keys():
            self.header[c] = col[c]
            if formula:
                self.items[c] = formula(self)
            else:
                self.items[c] = self.header[c].value[1]

    def show(self):
        print(self)

    def sub_row(self, cols):
        new_header = {}
        new_vals = {}
        for c in cols:
            new_header[c] = self.header[c]
            new_vals[c] = self.items[c]

        sr = SubRow(new_header, new_vals, self)
        self.sub_rows.append(sr)
        return sr

    def contains_sub(self, srow):
        if srow in self.sub_rows:
            return True
        return False

    def clone(self):
        return copy.deepcopy(self)

    def __str__(self):
        lst = [str(k) for k in self.items.values()]
        output = ""
        output += ''.join(['%-15s']*len(lst)) % tuple(lst)
        output += '\n'

        return output


class SubTable(Table):
    def __init__(self, parent, rows, ogrows, formulas, constraints, header=None, hascols=False):
        super().__init__(None, formulas, header)
        self.rows = rows
        self.ogrows = ogrows
        self.hascols = hascols
        self.constraints = constraints
        self.parent = parent
        self.header = header

    def alter(self, values):
        ret_table = self.clone(True)
        for p_r in self.ogrows:
            for c_r in self.rows:
                if p_r == c_r or (isinstance(c_r, SubRow) and p_r.contains_sub(c_r)):
                    passed = True
                    if not p_r.alter(values, self.constraints):
                        passed = False
                    for formula in self.formulas.keys():
                        if not p_r.alter({formula: self.formulas[formula](p_r)}, self.constraints):
                            passed = False

                    if passed:
                        ret_table.add_row(p_r)

        return ret_table

    def delete(self, clear=False):
        if clear:
            return super().delete()

        ret_table = self.clone(True)
        temp = []
        forms = {}
        default_vals = {}
        for p_r in self.ogrows:
            for c_r in self.rows:
                if (p_r == c_r) or (isinstance(c_r, SubRow) and p_r.contains_sub(c_r)):
                    temp.append(p_r)

        for h in self.parent.header.keys():
            if self.parent.header[h] != Type.LAMBDA:
                default_vals[h] = self.parent.header[h].value[1]
            else:
                forms[h] = self.formulas[h]

        for t in temp:
            if self.hascols:
                t.alter(default_vals)
                for f in forms.keys():
                    t.alter({f: forms[f](t)})
            else:
                self.ogrows.remove(t)
            ret_table.add_row(t)

        return ret_table


class SubRow(Row):
    def __init__(self, header, values, parent):
        super().__init__(header, values)
        self.parent = parent

    def isSubrow(self, r):
        if r == self.parent:
            return True
        return False


class TableOperator():

    # ^
    @classmethod
    def join_tables(self, t1, t2):
        header = {}
        formulas = {}
        ogformulas = list(set(t1.formulas.keys()) | set(t2.formulas.keys()))

        if t1.name is None:
            t1.setName("t1")
        if t2.name is None:
            t2.setName("t2")

        [header.update({f"{t1.name}_{k}": t1.header[k]
                        for k in t1.header.keys()})]
        [header.update({f"{t2.name}_{k}": t2.header[k]
                        for k in t2.header.keys()})]
        [formulas.update({f"{t1.name}_{k}": t1.formulas[k]})
         for k in t1.header.keys() if k in t1.formulas.keys()]
        [formulas.append({f"{t2.name}_{k}": t2.formulas[k]})
         for k in t2.header.keys() if k in t2.formulas.keys()]

        j = Table(f"{t1}_{t2}")
        for k in header.keys():
            j.add_col({k: header[k]})
        for t1_row in t1.rows:
            for t2_row in t2.rows:
                a = self.join_rows(t1.name, t2.name, header, t1_row, t2_row)
                j.add(a, True)

        return j

    # *
    @classmethod
    def merge_tables(self, t1, t2):
        col = set(t1.header.keys()) & set(t2.header.keys())
        formulas = {**t1.formulas, **t2.formulas}
        header = {**t1.header, **t2.header}
        j = Table(None, formulas)

        for k in header.keys():
            l = None
            if k in formulas.keys():
                l = formulas[k]

            if l:
                j.add_col({k: l})
            else:
                j.add_col({k: header[k]})

        if not col:
            return j

        for t1_row in t1.rows:
            for t2_row in t2.rows:
                add = True
                for matching_col in col:
                    if (t1_row.value(matching_col) != t2_row.value(matching_col)):
                        add = False

                if add:
                    j.add(self.merge_rows(header, t1_row, t2_row))

        return j

    # +
    @classmethod
    def clone_tables(self, t1, t2):
        dest = t1.clone(name=t1.name)
        dest.formulas = {**t1.formulas, **t2.formulas}

        for k in t2.header.keys():
            dest.add_col({k: t2.header[k]})

        for r in dest.rows:
            r.recalc(dest.formulas)

        return dest

    @classmethod
    def join_rows(self, t1, t2, header, r1, r2):
        r1_items = {}
        r2_items = {}

        for k in r1.items.keys():
            r1_items[f"{t1}_{k}"] = r1.items[k]

        for k in r2.items.keys():
            r2_items[f"{t2}_{k}"] = r2.items[k]

        return {**r1_items, **r2_items}

    @classmethod
    def merge_rows(self, header, r1, r2):
        r1_items = {}
        r2_items = {}

        for k in r1.items.keys():
            r1_items[f"{k}"] = r1.items[k]

        for k in r2.items.keys():
            r2_items[f"{k}"] = r2.items[k]

        return {**r1_items, **r2_items}
