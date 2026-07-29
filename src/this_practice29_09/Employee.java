/*Question 2: Employee Salary

Create an Employee class with:

empId
empName
salary

Use this inside the constructor.

Create a method display().*/

package this_practice29_09;

import java.util.Scanner;

public class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int employeeId, String employeeName, double employeesalary) {

        this.empId = employeeId;
        this.empName = employeeName;
        this.salary = employeesalary;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id");
        int empId = sc.nextInt();
        System.out.println("Enter the employee name");
        String empName = sc.next();
        System.out.println("Enter the employee salary");
        double salary = sc.nextDouble();

        Employee e1 = new Employee(empId, empName, salary);

        e1.display();

        System.out.println("Enter Second Employee Details:");

        System.out.println("Enter Employee Id:");
        int empId2 = sc.nextInt();

        System.out.println("Enter Employee Name:");
        String empName2 = sc.next();

        System.out.println("Enter Employee Salary:");
        double salary2 = sc.nextDouble();

        Employee e2 = new Employee(empId2, empName2, salary2);
        e2.display();
    }

    public void display() {
        System.out.println(" Employee Id is :" + empId);
        System.out.println(" Employee Name is :" + empName);
        System.out.println(" Employee Salary is :" + salary);

    }

}
