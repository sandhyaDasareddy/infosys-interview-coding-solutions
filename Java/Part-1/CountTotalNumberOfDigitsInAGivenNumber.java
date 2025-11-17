/*
Problem: Write a Java program to count the total number of digits in a given number.
------------------------------------------------------------------------------------
Example:
    Input  : 5821
    Output : 4

Logic Used:
    - Divide the number by 10 in each iteration
    - Increment count for each iteration
    - Continue until number becomes 0

Note:
    - If the number is negative, convert it to positive first.
------------------------------------------------------------------------------------
*/

import java.util.*;

class CountTotalNumberOfDigitsInAGivenNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");

        int num = sc.nextInt();
        int count = 0;

        if(num < 0)
        {
            num = -num;  // convert negative to positive
        }

        if(num == 0)
        {
            count = 1; // special case: 0 has 1 digit
        }
        else
        {
            while(num > 0)
            {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Total number of digits: " + count);
    }
}


/*
Output:-
--------
Enter number:
58974
Total number of digits: 5  
*/