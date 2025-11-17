"""
Problem: Check whether a number is prime.
Example:
    Input  : 7
    Output : Prime Number
Logic:
    - Check divisibility from 2 to n//2
"""

num = int(input("Enter number: "))

if num <= 1:
    print(f"{num} is not a prime number")
else:
    for i in range(2, num // 2 + 1):
        if num % i == 0:
            print(f"{num} is not a prime number")
            break
    else:
        print(f"{num} is a prime number")


"""
Output:
------
Enter number: 31
31 is a prime number

"""