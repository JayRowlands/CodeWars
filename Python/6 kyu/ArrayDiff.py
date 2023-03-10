# https://www.codewars.com/kata/523f5d21c841566fde000009

def array_diff(a, b):
    for x in b:
        if x in a:
            for y in range(a.count(x)):
                a.remove(x)
    return a