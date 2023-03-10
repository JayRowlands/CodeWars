# https://www.codewars.com/kata/514b92a657cdc65150000006

def solution(number):
    multiple = []
    i = 0
    if number == 0:
        return 0
    else:
        while i < number:
            if i % 5 == 0:
                multiple.append(i)
            elif i % 3 == 0:
                multiple.append(i)
            i+=1
    return sum(multiple)