def selectionSort(arr):
    min = 0
    length = len(arr)

    for i in range(length):
        min = i
        for z in range(i+1,length):

            if arr[min] > arr[z]:
                x = arr[min]
                y = arr[z]
                arr[min] = y
                arr[z] = x


    return arr
#bruh

array = [14,25,10,35,6,9]
print(selectionSort(array))