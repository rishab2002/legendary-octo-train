# import pdb;


def swap(xp, yp):
    x = xp
    y = yp
    xp = y
    yp = x
    return xp, yp


def bubble(arr):
    l = len(arr)
    # pdb.set_trace()

    for z in range(0, l - 1):
        sw = False
        for i in range(0, l - 1):
            if arr[i] > arr[i + 1]:
                arr[i], arr[i + 1] = swap(arr[i], arr[i + 1])
                sw = True
        if sw == False :
            break
        print(arr)



ar = [5, 4, 3, 2, 1]
bubble(ar)
