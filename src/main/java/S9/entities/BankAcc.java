package S9.entities;

public class BankAcc {
    private final int accId;
    private String accHolder;
    private double balance;

    public BankAcc(int accId, String accHolder, double initialDeposit) {
        this.accId = accId;
        this.accHolder = accHolder;
        depositCash(initialDeposit);
    }

    public BankAcc(int accId, String accHolder) {
        this.accId = accId;
        this.accHolder = accHolder;
    }

    public int getAccId() {
        return accId;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account "
                + getAccId()
                + ", Holder: "
                + getAccHolder()
                + ", Balance: "
                + String.format("%.2f",getBalance());
    }

    public void withdrawCash(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= (amount + 5.0);
        }
    }

    public void depositCash(double amount) {
        balance += amount;
    }
}
