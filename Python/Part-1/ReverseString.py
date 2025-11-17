"""
Problem: Reverse a given string.
Example:
    Input  : hello
    Output : olleh
Logic:
    - Use slicing [::-1] to reverse
"""

str_input = input("Enter a string: ")
rev = str_input[::-1]
print(f"Reverse of the string is : {rev}")

"""
Output:
-------
Enter a string: sandhya
Reverse of the string is : ayhdnas
"""