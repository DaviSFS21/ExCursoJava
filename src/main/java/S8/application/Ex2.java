package S8.application;

import S8.entities.Employee;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Employee y;
        y = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name, the gross salary and tax of the employee: ");
        y.name = sc.next();
        y.grossSalary = sc.nextDouble();
        y.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", y.name, y.NetSalary());

        System.out.println("Enter the salary increase percentage: ");
        y.percentage = sc.nextDouble();

        System.out.printf("Updated data: %s, $ %.2f%n", y.name, y.IncreaseSalary());
    }
}
