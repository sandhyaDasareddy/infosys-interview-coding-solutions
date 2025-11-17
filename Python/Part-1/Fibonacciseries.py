"""
Problem: Generate the Fibonacci series up to a given number of terms.
---------------------------------------------------------------------------------------------
Example:
    Input  : 7
    Output : 0 1 1 2 3 5 8

Logic Used:
    - Fibonacci series starts with 0 and 1
    - Each next term = sum of previous two terms
    - Repeat for given number of terms
---------------------------------------------------------------------------------------------
"""

# Input: Number of terms
n = int(input("Enter number of terms: "))

first = 0
second = 1

print("Fibonacci series:")

for i in range(n):
    print(first, end=" ")
    next_term = first + second
    first = second
    second = next_term

"""
Output:
-------
Enter number of terms: 5
Fibonacci series:
0 1 1 2 3 
"""
