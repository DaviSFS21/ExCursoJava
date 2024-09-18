package S10;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many numbers will you type(Max.: 10)? ");
        int quant = sc.nextInt();
        while (quant < 1 || quant > 10) {
            System.out.print("Type a number greater than 0 and less than 10: ");
            quant = sc.nextInt();
        }

        int[] Vector = new int[quant];

        for (int i = 0; i < quant; i++) {
            System.out.printf("%nType the %dº number: ",(i + 1));
            Vector[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Negative numbers: ");

        for (int i = 0; i < quant; i++) {
            if (Vector[i] < 0) {
                System.out.println(Vector[i]);
            }
        }
    }
}