package S10;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
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
        double bigNumber = 0;
        int pos = 0;

        for (int i = 0; i < quant; i++) {
            System.out.printf("%nType the %dº number: ",(i + 1));
            Vector[i] = sc.nextDouble();

            if (i == 0) { bigNumber = Vector[i]; }

            if (Vector[i] > bigNumber) {
                bigNumber = Vector[i];
                pos = i;
            }
        }

        System.out.println();
        System.out.println("The biggest number is: " + bigNumber);

        System.out.println();
        System.out.println("Biggest number position: " + pos);
    }
}