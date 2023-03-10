# https://www.codewars.com/kata/55c45be3b2079eccff00010f

def order(sentence):
    split = sentence.split(" ")
    my_dictionary = {}
        
    for i in split:
        for y in i:
            if y.isdigit():
                my_dictionary[y] = i
        
    sort_dict = sorted(my_dictionary.items())
    return ' '.join([x[1] for x in sort_dict])