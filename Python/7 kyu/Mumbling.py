# https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

def accum(s):
    count = 0
    string = ""
    for x in range(0,len(s)):
        string+= s[x].upper()
        string+= s[x].lower() *count
        count +=1
        if x+1 != len(s):
            string += "-"
    
    return string