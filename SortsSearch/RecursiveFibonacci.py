def recurFibo(steps):
    x = 0
    y = 1
    for i in range(0,steps):
        print(x)
        next = x + y
        x = y
        y = next

#test
recurFibo(10)