def linearSearch(arr , target):
    for x in range(0,len(arr)-1):
        if arr[x] == target :
            return print("Index: " + str(x))

    return print("Not in array.")

def binarySearch(arr , target):
    length = len(arr)
    notFound = True
    low = 0
    high = length - 1
    while notFound:
        if high < low:
            return print("Nothing exists here.")
        middle = int(low + ((high - low)/2))

        if arr[middle] < target:
            middle = middle + 1
        if arr[middle] > target:
            middle = middle - 1
        if arr[middle] == target:
            found = False
            return print("Index: " + str(middle))


    return print("Not in array")


arr = [10,2,4,5,7,6,9,8,0]
linearSearch(arr, 4)
binarySearch(arr , 7)


