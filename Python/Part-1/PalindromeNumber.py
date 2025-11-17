"""
Problem: Check whether a given number is a palindrome.
Example:
    Input  : 121
    Output : Palindrome Number
Logic:
    - Reverse the number and compare with original
"""

num = int(input("Enter number: "))
original_num = num
rev = 0
temp = num

while temp > 0:
    rem = temp % 10
    rev = rev * 10 + rem
    temp = temp // 10

if original_num == rev:
    print(f"Given number {original_num} is a Palindrome number")
else:
    print(f"Given number {original_num} is NOT a Palindrome number")


"""
Output:-
--------
Enter number: 18581
Given number 18581 is a Palindrome number
"""