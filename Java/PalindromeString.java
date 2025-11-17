/*
Problem: Write a Java program to check whether a given string is a palindrome or not.
-------------------------------------------------------------------------------------
Example:
    Input  : madam
    Reverse: madam
    Output : Palindrome String

What is a Palindrome?
    A string that reads the same forwards and backwards.

Logic Used:
    - Store original string
    - Reverse the string using a loop
    - Compare original string with reversed string using equals()
--------------------------------------------------------------------------------------
*/

import java.util.*;
class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");

        String str = sc.nextLine();
        String original_String = str;
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        if(original_String.equals(rev))
        {
            System.out.println("Given string \"" + original_String + "\" is a Palindrome string");
        }
        else
        {
            System.out.println("Given string \"" + original_String + "\" is NOT a Palindrome string");
        }
    }
}

/*
Output:-
-------
Enter string:
madam
Given string "madam" is a Palindrome string

*/