package com.JavaTraining.day3;
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount() {
        this(0, "Unknown", 0);
    }

    BankAccount(int accountNumber, String holderName) {
        this(accountNumber, holderName, 0);
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    abstract void withdraw(double amount);

    void displayDetails() {
        System.out.println("\nAccountNo. : " + accountNumber + "\nAccount Holder Name : " + holderName +
                "\nBalance: Rs." + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int no, String name, double balance) {
        super(no, name, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= 1000)
            setBalance(getBalance() - amount);
        else
            System.out.println("Savings: Minimum balance Rs.1000 required");
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(int no, String name, double balance) {
        super(no, name, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= -5000)
            setBalance(getBalance() - amount);
        else
            System.out.println("Current: Overdraft limit exceeded");
    }
}

public class task1 {
    public static void main(String[] args) {
        BankAccount account;

        account = new SavingsAccount(1001, "Ana", 5000);
        account.deposit(2000);
        account.withdraw(5500);
        account.displayDetails();

        account = new CurrentAccount(1002, "Pirate", 2000);
        account.deposit(1000);
        account.withdraw(7000);
        account.displayDetails();
    }
}