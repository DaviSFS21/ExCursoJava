package S10;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many students will you input? ");
        int quant = sc.nextInt();
        while (quant < 1) {
            System.out.print("Type a number greater than 0: ");
            quant = sc.nextInt();
        }

        char[] Gender = new char[quant];
        double[] Height = new double[quant];

        for (int i = 0; i < quant; i++) {
            System.out.printf("%nType the %dº people: %n",(i + 1));
            System.out.print("Height: ");
            Height[i] = sc.nextDouble();
            while (Height[i] < 0) {
                System.out.print("Type a number equal to or greater than 0: ");
                Height[i] = sc.nextDouble();
            }
            System.out.print("Gender(M or F): ");
            Gender[i] = sc.next().charAt(0);
        }

        double Tallest = 0;

        for (int i = 0; i < quant; i++) {
            if (Height[i] > Tallest) {
                Tallest = Height[i];
            }
        }

        double Smallest = Tallest;

        for (int i = 0; i < quant; i++) {
            if (Height[i] < Smallest) {
                Smallest = Height[i];
            }
        }

        double TotalFHeight = 0;
        int CountF = 0;
        int CountM = 0;

        for (int i = 0; i < quant; i++) {
            if (Gender[i] == 'F') {
                TotalFHeight += Height[i];
                CountF++;
            }
        }

        for (int i = 0; i < quant; i++) {
            if (Gender[i] == 'M') {
                CountM++;
            }
        }

        System.out.printf("Tallest: %.2f%n",Tallest);
        System.out.printf("Smallest: %.2f%n",Smallest);
        System.out.printf("Female average: %.2f%n",TotalFHeight/CountF);
        System.out.printf("Female average: %d%n",CountM);

        sc.close();
    }
}
