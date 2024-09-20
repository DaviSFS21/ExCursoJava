package S10;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many students will you input? ");
        int quant = sc.nextInt();
        while (quant < 1) {
            System.out.print("Type a number greater than 0: ");
            quant = sc.nextInt();
        }

        String[] Name = new String[quant];
        double[] Score1 = new double[quant];
        double[] Score2 = new double[quant];

        for (int i = 0; i < quant; i++) {
            System.out.printf("%nType the %dº people: %n",(i + 1));
            System.out.print("Name: ");
            sc.nextLine();
            Name[i] = sc.nextLine();
            System.out.print("Test score 1: ");
            Score1[i] = sc.nextDouble();
            System.out.print("Test score 2: ");
            Score2[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Approved students: ");

        for (int i = 0; i < quant; i++) {
            if ((Score1[i] + Score2[i]) / 2 >= 6) {
                System.out.println(Name[i]);
            }
        }

        sc.close();
    }
}