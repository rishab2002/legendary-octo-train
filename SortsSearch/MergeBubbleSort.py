def Bubble(arr):
    l = len(arr)

    for a in range(l):
        for b in range(0, l - 1, 1):

            if arr[b] > arr[b + 1]:
                x = arr[b + 1]
                arr[b + 1] = arr[b]
                arr[b] = x


def merge_sorted_lists(list_left, list_right):
    if len(list_left) == 0:
        return list_right
    elif len(list_right) == 0:
        return list_left

    index_left = index_right = 0
    list_merged = []
    list_len_target = len(list_left) + len(list_right)
    while len(list_merged) < list_len_target:
        if list_left[index_left] <= list_right[index_right]:
            list_merged.append(list_left[index_left])
            index_left += 1
        else:
            list_merged.append(list_right[index_right])
            index_right += 1
        if index_right == len(list_right):
            list_merged += list_left[index_left:]
            break
        elif index_left == len(list_left):
            list_merged += list_right[index_right:]
            break

    return list_merged

def split_list(a_list):
    half = len(a_list)//2
    return a_list[:half], a_list[half:]

def merge_sort(input_list):
    if len(input_list) <= 1:
        return input_list
    else:
        left, right = split_list(input_list)
        return merge_sorted_lists(merge_sort(left), merge_sort(right))