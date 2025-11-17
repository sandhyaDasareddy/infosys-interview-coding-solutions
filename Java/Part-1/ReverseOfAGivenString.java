/*
Problem: Write a Java program to reverse a given string.
------------------------------------------------------------
Example:
    Input  : hello
    Process: o l l e h
    Output : olleh

Logic Used:
    - Traverse the string from last index to first index
    - Extract each character using charAt(i)
    - Append it to a new string `rev`
    - Print the reversed string
------------------------------------------------------------
*/

import java.util.Scanner;

public class ReverseOfAGivenString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");

        String str = sc.nextLine();
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse of the string is : " + rev);
    }
}
/*
Output:-
-------
Enter a string
hello
Reverse of the string is : olleh

 */