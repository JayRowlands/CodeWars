# https://www.codewars.com/kata/526571aae218b8ee490006f4

def count_bits(n):
    binary = bin(n)
    count = 0
    l = str(binary)
    
    for i in str(l):
        if i == str(1):
            count = count + 1
    
    return count