package S9.application;

import S9.entities.BankAcc;

import java.util.Locale;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String accHolder;
        double initialDeposit;
        char option;

        System.out.println("Enter the account data: ");
        System.out.print("Account ID: ");
        int accId = sc.nextInt();

        sc.nextLine();

        System.out.print("Account holder: ");
        accHolder = sc.nextLine();

        BankAcc account = null;

        System.out.print("Is there a initial deposit? (y/n): ");
        do {
            option = sc.next().charAt(0);
                switch (option) {
                    case 'y':
                        System.out.print("Enter amount to deposit: ");
                        initialDeposit = sc.nextDouble();
                        account = new BankAcc(accId, accHolder, initialDeposit);
                        break;
                    case 'n':
                        account = new BankAcc(accId, accHolder);
                        break;
                    default:
                        System.out.print("Invalid option! Try again: ");
                        break;
                }
        } while (option != 'y' && option != 'n');

        System.out.printf("%nData: %s %n %n", account);

        double amount;

        System.out.print("Insert the withdrawal value minus the bank tax($5.0): ");
        amount = sc.nextDouble();
        sc.nextLine();

        account.withdrawCash(amount);
        System.out.printf("%nData: %s%n%n", account);

        System.out.print("Insert the deposit value: ");
        amount = sc.nextDouble();
        sc.nextLine();

        account.depositCash(amount);
        System.out.printf("%nData: %s%n%n", account);
    }
}
