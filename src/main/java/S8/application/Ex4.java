package S8.application;

import S8.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dollar price: ");
        double dollarPrice = sc.nextDouble();
        System.out.println("Enter the amount of dollar to be bought: ");
        double dollarAmount = sc.nextDouble();

        double totalPrice = CurrencyConverter.toBePaid(dollarPrice, dollarAmount);

        System.out.printf("Amount to be paid in BRL: %.2f", totalPrice);
    }
}
