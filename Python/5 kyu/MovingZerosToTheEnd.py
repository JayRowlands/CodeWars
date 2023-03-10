# https://www.codewars.com/kata/52597aa56021e91c93000cb0

def move_zeros(array):
    for i in range(0, len(array)):
        print(array[i])
        if array[i] == 0:
            array.remove(array[i])
            array.append(0)
            
    return array