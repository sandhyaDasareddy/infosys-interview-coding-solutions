/* 
problem: Write a Java program to reverse a given number.
------------------------------------------------------------
Example:
    Input  : 1234
    Process: 4 3 2 1
    Output : 4321

Logic Used:
    - Extract last digit using n % 10
    - Build reverse using rev = rev * 10 + rem
    - Remove last digit using n / 10
    - Repeat until number becomes 0

------------------------------------------------------------
*/

import java.util.*;
class ReverseOfGivenNumber
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = sc.nextInt();
        int rev = 0;

        while (n > 0) {

            int rem = n % 10;     // Extract last digit
            rev = rev * 10 + rem; // Build reversed number
            n = n / 10;           // Remove last digit

        }

        System.out.println("Reverse of the given number is : " + rev);
    }
}

/*
Output:-
------
Enter a number
4568
Reverse of the given number is : 8654

*/