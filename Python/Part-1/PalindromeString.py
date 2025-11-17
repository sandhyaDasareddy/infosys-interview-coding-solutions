"""
Problem: Check whether a given string is a palindrome.
Example:
    Input  : madam
    Output : Palindrome String
Logic:
    - Reverse string and compare with original
"""

str_input = input("Enter string: ")
if str_input == str_input[::-1]:
    print(f'Given string "{str_input}" is a Palindrome string')
else:
    print(f'Given string "{str_input}" is NOT a Palindrome string')


"""
Output:
-------
Enter string: mam 
Given string "mam" is a Palindrome string

"""