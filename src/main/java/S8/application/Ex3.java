package S8.application;

import S8.entities.Student;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Student z;
        z = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student: ");
        z.name = sc.next();
        System.out.println("Enter the first grade of the student: ");
        double grade1 = sc.nextDouble();
        System.out.println("Enter the second grade of the student: ");
        double grade2 = sc.nextDouble();
        System.out.println("Enter the third grade of the student: ");
        double grade3 = sc.nextDouble();

        System.out.printf("Final grade = %.2f", z.finalGrade());

        if (z.finalGrade() >= 6) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
            System.out.printf("Missing = %.2f", 6 - z.finalGrade());
        }
    }
}
