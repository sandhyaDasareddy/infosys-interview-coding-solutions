"""
Problem: Count the total number of digits in a given number.
Example:
    Input : 5821
    Output: 4
Logic:
    - Convert number to string and count length
    - Handle negative numbers by abs()
"""

num = int(input("Enter number: "))
count = len(str(abs(num)))
print(f"Total number of digits: {count}")

"""
Output:-
-------
Enter number: 25874
Total number of digits: 5

"""
