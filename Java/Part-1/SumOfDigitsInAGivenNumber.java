/* 
Problem: Write a Java program to find the **sum of digits** of a given number.
------------------------------------------------------------------------------
Example:
    Input  : 1234
    Process: 1 + 2 + 3 + 4
    Output : 10

Logic Used:
    - Extract the last digit using n % 10
    - Add it to sum
    - Remove last digit using n / 10
    - Repeat until n becomes 0
------------------------------------------------------------------------------
*/
import java.util.*;
public class SumOfDigitsInAGivenNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println("sum of digits in a given number is : "+sum);
    }
}
/*
Output:-
---------
Enter a number
23232
sum of digits in a given number is : 12

*/