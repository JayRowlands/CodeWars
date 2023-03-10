# https://www.codewars.com/kata/51b62bf6a9c58071c600001b

def solution(n):
    roman = [(1000, "M"), (900, "CM"), (500, "D"), (400, "CD"), (100, "C"), (90, "XC"), (50, "L"), 
             (40, "XL"), (10, "X"), (9, "IX"), (5, "V"), (4, "IV"), (1, "I")]
    
    toReturn = ""
    while n > 0:
        for i, j in roman:
            while n >= i:
                toReturn += j
                n -= i
            
    return toReturn