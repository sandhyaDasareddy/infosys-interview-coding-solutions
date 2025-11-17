/*

Problem: Write a Java program to generate the Fibonacci series up to a given number of terms.
---------------------------------------------------------------------------------------------
Example:
    Input  : 7
    Output : 0 1 1 2 3 5 8

Logic Used:
    - Fibonacci series starts with 0 and 1
    - Each next term = sum of previous two terms
    - Repeat for given number of terms
---------------------------------------------------------------------------------------------
*/

import java.util.*;

class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");

        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci series:");

        for(int i = 1; i <= n; i++)
        {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}


/*
Output:-
-------
Enter number of terms:
5 
Fibonacci series:
0 1 1 2 3
*/