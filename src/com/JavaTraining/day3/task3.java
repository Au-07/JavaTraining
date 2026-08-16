package com.JavaTraining.day3;

class BankAccount0 {
    private int accountNumber;
    private String holderName;
    private double balance;

    BankAccount0(int no, String name, double balance) {
        this.accountNumber = no;
        this.holderName = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("\nInvalid withdrawal");
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("\nInvalid deposit");
    }

    public void checkBalance() {
        System.out.println("\nBalance: Rs." + balance);
    }

    public void displayDetails() {
        System.out.println("\nAccount No: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: Rs." + balance);
    }
}

class SavingsAccount0 extends BankAccount0 {
    private double interestRate;

    SavingsAccount0(int no, String name, double balance, double rate) {
        super(no, name, balance);
        interestRate = rate;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 1000)
            super.withdraw(amount);
        else
            System.out.println("\nMinimum balance Rs.1000 required");
    }
}

class CurrentAccount0 extends BankAccount0 {
    private double overdraftLimit;

    CurrentAccount0(int no, String name, double balance, double limit) {
        super(no, name, balance);
        overdraftLimit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit)
            super.withdraw(amount);
        else
            System.out.println("\nOverdraft limit exceeded");
    }
}

class ATM {
    private int atmId;
    private String location;
    private double cashAvailable;
    private BankAccount0 account;
    private int pin = 1234;

    ATM(int id, String location, double cash, BankAccount0 account) {
        this.atmId = id;
        this.location = location;
        this.cashAvailable = cash;
        this.account = account;
    }

    void insertCard() {
        System.out.println("Card Inserted");
    }

    boolean enterPin(int enteredPin) {
        return enteredPin == pin;
    }

    void checkBalance() {
        account.checkBalance();
    }

    void withdrawCash(double amount) {
        if (amount <= cashAvailable && amount <= account.getBalance()) {
            account.withdraw(amount);
            cashAvailable -= amount;
            System.out.println("Rs." + amount + " withdrawn successfully.");
            checkBalance();
        } else {
            System.out.println("Transaction failed");
        }
    }

    void depositCash(double amount) {
        account.deposit(amount);
        cashAvailable += amount;
        System.out.println("Rs." + amount + " deposited successfully.");
    }

    void accountDetails() {
        account.displayDetails();
    }

    void exit() {
        System.out.println("Thank you. Card removed.");
    }
}
public class task3 {
	 public static void main(String[] args) {

	        BankAccount0 account =
	            new SavingsAccount0(1001, "Ana", 30000, 4.5);

	        ATM atm = new ATM(101, "Coimbatore", 100000, account);

	        atm.insertCard();

	        if (atm.enterPin(1234)) {
	            System.out.println("Login Successful!");

	            atm.checkBalance();
	            atm.withdrawCash(5000);
	            atm.depositCash(2000);
	            atm.accountDetails();
	            atm.exit();
	        } else {
	            System.out.println("Invalid PIN");
	        }
	    }
}



