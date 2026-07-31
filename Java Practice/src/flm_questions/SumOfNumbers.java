/*
1. Find the Sum of Numbers in a Given Interval (Java)
Given two integers representing the start and end of an interval, write a Java program to
calculate the sum of all the numbers within that interval (inclusive).
Example:
• Input: Start = 1, End = 5
• Output: 15
Explanation:
The numbers in the interval are 1, 2, 3, 4, 5. Their sum is 15.
*/


package flm_questions;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter your starting Value");

        int start = sc.nextInt();

        System.out.println(" Enter your ending Value");

        int end = sc.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum = sum + i;

        }

        System.out.println(sum);

    }

}
