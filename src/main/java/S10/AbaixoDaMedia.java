package S10;

import java.util.Scanner;
import java.util.Locale;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("How many numbers will you type? ");
        int quant = sc.nextInt();
        while (quant < 1) {
            System.out.print("Type a number greater than 0: ");
            quant = sc.nextInt();
        }

        double[] a = new double[quant];
        double total = 0;

        for (int i = 0; i < quant; i++) {
            System.out.printf("%nType a number: ");
            a[i] = sc.nextDouble();

            total += a[i];
        }

        System.out.println();
        System.out.println("Average: " + total / quant);

        System.out.println();
        System.out.println("Numbers below the average: ");

        for (int i = 0; i < quant; i++) {
            if (a[i] < total / quant) {
                System.out.printf("%.2f  ",a[i]);
            }
        }

        sc.close();
    }
}