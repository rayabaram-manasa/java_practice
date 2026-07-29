/*Question 1: Student Details

Create a Student class with:

id
name

Create a constructor using this keyword to initialize the variables.

Create two student objects and print their details. */

package this_practice29_09;

import java.util.Scanner;

public class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the id:");
        int id = sc.nextInt();
        System.out.println("Enter the name:");
        String name = sc.next();

        Student s1 = new Student(id, name);

        System.out.println(" Student ID is :" + s1.id);
        System.out.println(" Student Name is :" + s1.name  );

    }

}
