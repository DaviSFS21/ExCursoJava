package S10;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many numbers will you type? ");
        int quant = sc.nextInt();
        while (quant < 1) {
            System.out.print("Type a number greater than 0: ");
            quant = sc.nextInt();
        }

        int[] Vector = new int[quant];

        for (int i = 0; i < quant; i++) {
            System.out.printf("%nType the %dº number: ",(i + 1));
            Vector[i] = sc.nextInt();
        }

        int count = 0;

        System.out.println();
        System.out.println("Even numbers: ");

        for (int i = 0; i < quant; i++) {
            if (Vector[i] % 2 == 0) {
                System.out.printf("%d  ",Vector[i]);
                count++;
            }
        }

        System.out.println();
        System.out.println("Even numbers quantity: " + count);
    }
}