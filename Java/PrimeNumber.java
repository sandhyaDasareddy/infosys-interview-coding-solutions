/*
Problem: Write a Java program to check whether a number is a prime number or not.

What is a Prime Number?
    A prime number is a number greater than 1 that has
    exactly two factors: 1 and itself.

Example:
    Input  : 11
    Output : Prime Number

    Logic Used:
    - Check divisibility from 2 to n/2
    - If divisible → not prime
    - If not divisible → prime
------------------------------------------------------------
*/

import java.util.*;
class PrimeNumber{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        int num = sc.nextInt();
        int count = 0;

        if(num <= 1)  // special case
        {
            System.out.println(num + " is not a prime number");
            return;
        }

        for(int i = 2; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                count++;
                break;
            }
        }

        if(count == 0)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
    }
}

/*
Output:
-------
Enter number:
7
7 is a prime number
*/