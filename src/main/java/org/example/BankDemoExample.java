package org.example;

public class BankDemoExample {
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankDemoExample() {
        this.accountNumber = "000000";
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
    }

    public BankDemoExample(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited");
        } else {
            System.out.println("Successfuly not deposited");
        }
    }
    void withDraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or Insufficient funds");
        }
    }

    void displayBalance() {
        System.out.println(accountHolderName + " " + accountNumber + " " + balance);
    }

    public static void main(String[] args) {
        BankDemoExample account1 = new BankDemoExample("111", "Adi",  5000);
    }

}
