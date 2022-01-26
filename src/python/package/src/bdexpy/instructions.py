from .structures import Table, Row
from .enums import Type
from os import path
import unicodedata


def read_str():
    return input()


def read_int():
    return int(input())


def read_real():
    return float(input())


def print_var(var):
    print(var)

# INIT
# def assignment(nome, value):
#    nome = value


def file_import(file_name: str):

    col_names = []
    header = {}
    t = Table

    if not path.exists(file_name + ".csv"):
        return False

    with open(file_name + ".csv", "r") as f:
        line = f.readlines()
        for l in line:
            if l == line[0]:
                l = l.strip()
                first = l.split("\t")
                for col in first:
                    col = col.split(":")
                    col_names.append(col[0])
                    if col[1] == 'INT':
                        ty = Type.INT
                    elif col[1] == 'STRING':
                        ty = Type.STRING
                    else:
                        ty = Type.FLOAT
                    header[col[0]] = ty

                t = Table(file_name, header=header)

            else:
                l = l.strip()
                if l != '':
                    a = l.split('\t')
                    t.add(tuple(a))
    return t


def file_export(table: Table):

    he = table.header
    ro = table.rows

    with open(table.name + ".csv", "w") as f:
        itemsIdx = [he[h] != Type.LAMBDA for h in he.keys()]
        items = [h for h in he.keys() if he[h] != Type.LAMBDA]
        f.write(
            "\t".join(list(map(lambda h: f"{strip_accents(h)}:{he[h].name}", items))) + "\n")

        for r in ro:
            line = [str(k) for k in r.items.values()]
            newLine = []
            for i in range(len(line)):
                if itemsIdx[i]:
                    if line[i]:
                        newLine.append(line[i])
                    else:
                        newLine.append("EMPTY")

            f.write(strip_accents("\t".join(newLine) + "\n"))


def strip_accents(text):
    nfkd_form = unicodedata.normalize('NFKD', text)
    return u"".join([c for c in nfkd_form if not unicodedata.combining(c)])
