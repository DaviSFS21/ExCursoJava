package S10;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("How many people will you input? ");
        int quant = sc.nextInt();
        while (quant < 1) {
            System.out.print("Type a number greater than 0: ");
            quant = sc.nextInt();
        }

        String[] Name = new String[quant];
        int[] Age = new int[quant];
        double TotalHeight = 0;

        for (int i = 0; i < quant; i++) {
            System.out.printf("%nType the %dº people: %n",(i + 1));
            System.out.print("Name: ");
            sc.nextLine();
            Name[i] = sc.nextLine();
            System.out.print("Age: ");
            Age[i] = sc.nextInt();
            System.out.print("Height: ");
            TotalHeight += sc.nextDouble();
        }

        int count = 0;

        for (int i = 0; i < quant; i++) {
            if (Age[i] < 16) {
                count += 1;
            }
        }

        System.out.println();
        System.out.printf("Average height: %.2f%n",TotalHeight/quant);
        System.out.printf("People with less than 16 years: %.2f%% %n",((double)count/quant)*100);

        for (int i = 0; i < quant; i++) {
            if (Age[i] < 16) {
                System.out.println(Name[i]);
            }
        }

        sc.close();
    }
}