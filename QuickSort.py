def findPivot(arr, low, high):
    mid =int((high-low) / 2)
    if arr[mid] < arr[low]:
        x = arr[mid]
        y = arr[low]
        arr[low] = x
        arr[mid] = y
    if arr[high] < arr[low]:
        x = arr[high]
        y = arr[low]
        arr[low] = x
        arr[high] = y
    if arr[mid] < arr[high]:
        x = arr[mid]
        y = arr[high]
        arr[high] = x
        arr[mid] = y
    pivot = arr[high]
    return pivot

def partition(arr , low , high):
    pivot = arr[high]
    i = low - 1

    for j in range(low,high):
        if arr[j] < pivot:
            x = arr[i]  #SWAPS
            y = arr[j]
            arr[i] = y
            arr[j] = x
            i = i + 1
    a = arr[i]
    b = arr[high]
    arr[i] = b
    arr[high] = a
    return i


def quicksort(arr , low , high):
    if arr[low] < arr[high] :
        pivot = partition(arr, low , high)
        quicksort(arr, low, pivot-1)
        quicksort(arr ,pivot+1 , high)

    return arr







arr = [1,2,3]
high = len(arr) - 1
low = 0
print(quicksort(arr , low, high))