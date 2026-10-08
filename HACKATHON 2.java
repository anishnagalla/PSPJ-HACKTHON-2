import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int accountNumber = sc.nextInt();
            String accountHolderName = sc.next();
            double balance = sc.nextDouble();

            BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);

            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);

            account.displayAccount();
        }
    }
}

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}