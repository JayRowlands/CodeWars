# https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c

def max_sequence(arr):
    max_currently = 0
    max_ending = 0
    
    for i in range(0,len(arr)):
        
        max_ending = max_ending + arr[i]
        
        if max_currently < max_ending:
            max_currently = max_ending
            
        if(max_ending < 0):
            max_ending = 0
            
    return max_currently