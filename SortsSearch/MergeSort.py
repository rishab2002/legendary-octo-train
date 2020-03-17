
#
#
#
# ar = [1,3,2,6,7,0,9,8]
#
# print(merge_sort(ar))

# def factorial(num):
#     x = num
#     output = 1
#     if num == 0:
#         return print("0! = 1")
#     elif num < 0:
#         return print("undefined")
#     while x > 0:
#         output = x * output
#
#         x = x - 1
#     return print(str(num) + "! = " + str(output))
#
# def merge_sort(list):
#     after = [];
#     if len(list) <= 1:
#         return list
#     else:
#         half = len(list) // 2
#         l = list[:half]
#         r = list[half:]
#         if r[0] > l [0]:
#             after.append(l [0])
#             after.append(r[0])
#         else:
#             after.append(r[0])
#             after.append(l [0])
#     return after
#
# ar = [3,2]
# print(merge_sort(ar))
#
# factorial(23)
# def merge(l, r):
#     lindex, rindex = 0, 0
#     res = []
#     while lindex < len(l) and rindex < len(r):
#         if l[lindex] < r[rindex]:
#             res.append(l[lindex])
#             lindex += 1
#         else:
#             res.append(r[rindex])
#             rindex += 1
#
#     res = res + l[lindex:]
#     res = res + r[rindex:]
#     return res

# def merge_sort(array):
#
#
#
#     half = len(array) // 2
#     l = array[:half]
#     r = array[half:]
#
#     sarr = ms(l,r)
#
#     return sarr
#
# def ms(left , right):
#     if ((len(left) == 1) and (len(right) == 1)):
#         if left > right:
#             arr = []
#             arr.append(right)
#             arr.append(left)
#             return arr
#         else:
#             arr = []
#             arr.append(left)
#             arr.append(right)
#             return arr
#
#     elif (len(left) == 1):
#         if left[0] > (ms([],right))[0]:
#             return [(ms([],right)),left]
#         else:
#             return [left, (ms([], right))]
#
#
#     elif (len(right) == 1):
#         if right[0] > (ms(left,[]))[0]:
#             return [ms(left,[]),right]
#         else:
#             return [right, (ms(left, []))]
#
#     elif (len(left) < 1):
#
#         halfright = len(right) // 2
#
#
#         rl = right[halfright:]
#         rr = right[:halfright]
#
#         return ms(rl, rr)
#     elif (len(right) < 1):
#         halfleft = len(left) // 2
#
#
#         ll = left[halfleft:]
#         lr = left[:halfleft]
#
#
#         return ms(ll, lr)
#
#
#     else:
#         halfleft = len(left) // 2
#         halfright = len(right) //2
#
#         ll = left[halfleft:]
#         lr = left[:halfleft]
#         rl = right[halfright:]
#         rr = right[:halfright]
#
#         return ms(ms(ll,lr),ms(rl,rr))
#

def merge_sort(array):
    if len(array) > 1:
        half = len(array) // 2
        l = array[:half]
        r = array[half:]
    merge_sort(l)
    merge_sort(r)

    index = 0
    jindex = 0
    count = 0

    while index < len(l) and jindex < len(r):
        if l[index] < r[jindex]:
            array[count] = l[index]
            index = index + 1
        else:
            array[count] = r[jindex]
            jindex = jindex + 1
        count = count + 1

    while index < len(l):
        array[count] = l[index]
        index = index + 1
        count = count + 1

    while jindex < len(r):
        array[count] = r[jindex]
        jindex = jindex + 1
        count = count + 1

a = [3,2,1]
merge_sort(a)
