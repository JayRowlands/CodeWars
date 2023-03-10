# https://www.codewars.com/kata/52fba66badcd10859f00097e

def disemvowel(string_):
    for s in ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]:
        if s in string_:
            string_ = string_.replace(s, "")
    return string_