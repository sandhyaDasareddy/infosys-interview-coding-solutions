"""
Problem: Reverse a given number.
Example:
    Input  : 1234
    Output : 4321
Logic:
    - Extract last digit and build reverse
"""

num = int(input("Enter a number: "))
rev = 0
temp = num

while temp > 0:
    rem = temp % 10
    rev = rev * 10 + rem
    temp = temp // 10

print(f"Reverse of the given number is : {rev}")


"""
Output:-
-------
Enter a number: 1234
Reverse of the given number is : 4321
"""