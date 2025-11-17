/*

Problem:Write a Java program to check whether a given number is a palindrome or not.
------------------------------------------------------------------------------------
Example:
    Input  : 121
    Reverse: 121
    Output : Palindrome Number

What is a Palindrome?
    A number that reads the same forward and backward.

Logic Used:
    - Store the original number
    - Reverse the number using:
          rem = num % 10
          rev = rev * 10 + rem
          num = num / 10
    - Compare reversed number with original number

--------------------------------------------------------------------------------------
*/

import java.util.*;
class PalindromeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        int num = sc.nextInt();
        int original_num = num;
        int rev = 0;

        while(num > 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if(original_num == rev)
        {
            System.out.println("Given number " + original_num + " is a Palindrome number");
        }
        else
        {
            System.out.println("Given number " + original_num + " is NOT a Palindrome number");
        }
    }
}

/*
Output:-
-------
Enter number:
121
Given number 121 is a Palindrome number
*/