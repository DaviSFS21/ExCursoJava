package S10;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many numbers will you type in the two vectors? ");
        int quant = sc.nextInt();
        while (quant < 1) {
            System.out.print("Type a number greater than 0: ");
            quant = sc.nextInt();
        }

        int[] a = new int[quant];
        int[] b = new int[quant];

        System.out.printf("%nType the values of the A vector: %n");
        for (int i = 0; i < quant; i++) { a[i] = sc.nextInt(); }

        System.out.printf("%nType the values of the B vector: %n");
        for (int i = 0; i < quant; i++) { b[i] = sc.nextInt(); }

        System.out.println();
        System.out.println("The resulting vector is: ");

        for (int i = 0; i < quant; i++) { System.out.println(a[i] + b[i]); }

        sc.close();
    }
}