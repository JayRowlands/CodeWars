# https://www.codewars.com/kata/541c8630095125aba6000c00

def digital_root(n):
    summed = str(n)
    calc = 0
    
    if len(summed) < 2:
        return int(summed)
    elif len(summed) > 1:
        calc = sum(int(i) for i in summed)
        return digital_root(calc)