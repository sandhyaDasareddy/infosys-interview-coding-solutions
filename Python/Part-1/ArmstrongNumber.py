"""
Problem: Check whether a given number is an Armstrong number or not.
Example:
    Input  : 153
    Process: 1^3 + 5^3 + 3^3 = 153
    Output : Armstrong Number
Logic:
    - Count number of digits using len(str(num))
    - Extract each digit using % 10
    - Raise it to power of count and sum
    - Compare sum with original number
"""

num = int(input("Enter number: "))
original_num = num
count = len(str(abs(num)))
sum = 0
temp = num

while temp > 0:
    rem = temp % 10
    sum += rem ** count
    temp = temp // 10

if sum == original_num:
    print(f"{original_num} is an Armstrong number")
else:
    print(f"{original_num} is NOT an Armstrong number")



"""
Output:-
--------
Enter number: 153
153 is an Armstrong number

"""