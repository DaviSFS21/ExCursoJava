package S10;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many numbers will you type? ");
        int quant = sc.nextInt();
        while (quant < 1) {
            System.out.print("Type a number greater than 0: ");
            quant = sc.nextInt();
        }

        double[] Vector = new double[quant];

        for (int i = 0; i < quant; i++) {
            System.out.printf("%nType the %dº number: ",(i + 1));
            Vector[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Numbers: ");

        double Total = 0;

        for (int i = 0; i < quant; i++) {
            if (Vector[i] < 0) { System.out.println(Vector[i]); }

            Total += Vector[i];
        }

        System.out.printf("%nTotal: %.2f%nAverage: %.2f", Total, ( Total / quant));

        sc.close();
    }
}