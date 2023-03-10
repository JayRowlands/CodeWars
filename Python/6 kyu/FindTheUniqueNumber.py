# https://www.codewars.com/kata/585d7d5adb20cf33cb000235

def find_uniq(arr):
    # your code here
    arr.sort()
    if arr[0] < arr[len(arr)-1] and arr[0] < arr[len(arr)-2]:
        return arr[0]
    else: 
        return arr[len(arr)-1]