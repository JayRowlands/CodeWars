# https://www.codewars.com/kata/53dbd5315a3c69eed20002dd

def filter_list(l):
    new_l = []
    
    for i in l:
        if isinstance(i, int):
            new_l.append(i)
    return new_l