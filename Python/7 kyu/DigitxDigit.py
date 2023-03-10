# https://www.codewars.com/kata/546e2562b03326a88e000020

def square_digits(num):
    integer = str(num)
    toReturn = ""
    for i in integer:
        toReturn += str(int(i)*int(i))
        
    return int(toReturn)