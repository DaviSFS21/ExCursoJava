package S8.application;

import S8.entities.Rectangle;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Rectangle x;
        x = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height and weight of the rectangle:");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();

        double area = x.area();
        double perimeter = x.perimeter();
        double diagonal = x.diagonal();

        System.out.printf("Area: %.2f%nPerimeter: %.2f%nDiagonal: %.2f", area, perimeter, diagonal);
    }
}
