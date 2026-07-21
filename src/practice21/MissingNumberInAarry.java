/*
 * Problem: Find the Missing Number in an Array (1 to N).
 * Logic: Calculates expected sum of numbers 1 to N using formula N*(N+1)/2.
 * Then loops through the array to find the actual sum of given inputs.
 * The difference (expectedSum - actualSum) gives the missing number.
 */

package practice21;

import java.util.Scanner;

public class MissingNumberInAarry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of an array :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];

        }
        int n = size + 1;
        int expectedSum = (n * (n + 1)) / 2;

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is : " + missingNumber);

    }

}
