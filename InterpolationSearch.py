def interpolationSearch(arr , target):
    length = len(arr)
    x = target
    notFound = True
    low = 0
    high = length - 1

    while notFound:
        if arr[low] == arr[high] :
            return print("Failure")
        elif low == high:
            return print("Failure")

        mid = int(low + ((high - low) / (arr[high] - arr[low])) * (x - arr[low]))

        if arr[mid] == x :
            notFound = False
            return print("Found at index: " + str(mid))
        else:
            if arr[mid] > x :
                low = mid + 1
            elif arr[mid] < x:
                high = mid - 1


arr = [1,2,3,4,5,6,7,8,9,10]
print("First One: ")
interpolationSearch(arr , 3)
arr = [3,2,1,4,5,7,9,8,6,10]
print("Second One: ")
interpolationSearch(arr,3)
