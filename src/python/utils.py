def partition(rows, low, high, col):
    i = (low-1)
    pivot = rows[high].value(col) 
  
    for j in range(low, high):
  
        if rows[j].value(col) <= pivot:
            i = i+1
            rows[i], rows[j] = rows[j], rows[i]
  
    rows[i+1], rows[high] = rows[high], rows[i+1]
    return (i+1)
  
def quickSort(rows, low, high, col):
    if len(rows) == 1:
        return rows
    if low < high:
        pi = partition(rows, low, high, col)

        quickSort(rows, low, pi-1, col)
        quickSort(rows, pi+1, high, col)
