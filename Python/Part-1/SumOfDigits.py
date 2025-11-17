"""
Problem: Find the sum of digits of a given number.
Example:
    Input  : 1234
    Output : 10
Logic:
    - Extract each digit and add to sum
"""

num = int(input("Enter a number: "))
sum_digits = 0
temp = num

while temp > 0:
    sum_digits += temp % 10
    temp = temp // 10

print(f"Sum of digits in the given number is : {sum_digits}")


"""
Output:
------
Enter a number: 147
Sum of digits in the given number is : 12

"""