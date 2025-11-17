/*
Problem: Write a Java program to check whether a given number is an Armstrong number or not.
---------------------------------------------------------------------------------------------
Example:
    Input  : 153
    Process: 1^3 + 5^3 + 3^3 = 153
    Output : Armstrong Number

Logic Used:
    - Count number of digits using String.valueOf(num).length()
    - Extract each digit using % 10
    - Raise it to power of count and sum
    - Compare sum with original number
---------------------------------------------------------------------------------------------
*/

import java.util.*;

class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        int num = sc.nextInt();
        int original_num = num;
        int sum = 0;

        int count = String.valueOf(Math.abs(num)).length(); // Number of digits

        while(num > 0)
        {
            int rem = num % 10;
            sum += (int)Math.pow(rem, count); // Sum of digits^count
            num = num / 10;
        }

        if(original_num == sum)
        {
            System.out.println(original_num + " is an Armstrong number");
        }
        else
        {
            System.out.println(original_num + " is NOT an Armstrong number");
        }
    }
}

/* 
Output:-
-------
Enter number:
153
153 is an Armstrong number
*/ 