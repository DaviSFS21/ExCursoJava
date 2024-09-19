package S10;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
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
        String OldestName = "";
        int OldestAge = -1;

        for (int i = 0; i < quant; i++) {
            System.out.printf("%nType the %dº people: %n",(i + 1));
            System.out.print("Name: ");
            sc.nextLine();
            Name[i] = sc.nextLine();
            System.out.print("Age: ");
            Age[i] = sc.nextInt();
            while (Age[i] <= 0) {
                System.out.print("Type a number equal to or greater than 0: ");
                quant = sc.nextInt();
            }

            if (Age[i] > OldestAge) {
                OldestName = Name[i];
                OldestAge = Age[i];
            }
        }

        System.out.println();
        System.out.printf("Oldest person: %s%n",OldestName);

        sc.close();
    }
}