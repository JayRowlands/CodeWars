# https://www.codewars.com/kata/52724507b149fa120600031d

from math import trunc

tens = ['ten', 'twenty', 'thirty', 'forty', 'fifty', 'sixty', 'seventy', 'eighty', 'ninety']
vals = ['zero','one','two','three','four','five','six','seven','eight','nine','ten','eleven', 'twelve', 'thirteen', 'fourteen', 'fifteen', 'sixteen','seventeen','eighteen','nineteen']
vals = dict(list(enumerate(vals)))
tens = dict(zip(range(10, 100, 10), tens))

def ones(num):
    word = ''
    if num in vals.keys():
        word = vals.get(num)
    return word

def ty(num):
    word = ''
    if num in tens.keys():
        word = tens.get(num)
    return word


def number2words(num):
    result = ''
    if num == '':
        return 'zero'
    elif num in range(0,10):
        return ones(num)
    else:
        if num>=100000:
            if len(str(num%100000)) < 4:
                result+=ones(int(trunc(num/100000))) + " hundred thousand "
                num=num%1000
            else:
                result+=ones(int(trunc(num/100000))) + " hundred "
                num=num%100000
        if num>=10000:
            if trunc(num/1000) < 20:
                result+=ones(int(num/1000)) +" thousand "
                num=num%1000
            elif (trunc(num/1000)%10) == 0:
                result+=ty(int(trunc(num/1000))) +" thousand "
                num=num%1000
            else:
                result+=ty(int(trunc(num/10000)*10)) + "-"
                num=num%10000
        if num>=1000:
            result+=ones(int(num/1000)) +" thousand "
            num=num%1000
        if num >=100:
            result+=ones(int(num/100)) +" hundred "
            num=num%100
        if num >=20:
            result +=(ty(int(num/10)*10)) +"-"
            num=num%10
        if num >=1:
            result += ones(num)
    return result[:-1] if result[-1] == '-' or result[-1] == ' ' else result