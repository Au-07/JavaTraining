package com.JavaTraining.day5;

public class ImportantDesignRequirements {
    static String bankName = "MARIAMMAN INDIAN BANK";
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;

    ImportantDesignRequirements(int accountNumber, String accountHolderName,
                        String mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit amount");
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            System.out.println("Invalid withdrawal amount");
        else if (amount > balance)
            System.out.println("Insufficient balance");
        else
            balance -= amount;
    }

    public void displayAccountDetails() {
        System.out.println("\nBank: " + bankName);
        System.out.println("Account No: " + getAccountNumber());
        System.out.println("Name: " + getAccountHolderName());
        System.out.println("Mobile: " + getMobileNumber());
        System.out.println("Type: " + getAccountType());
        System.out.println("Balance: Rs." + getBalance());
    }

    public static void main(String[] args) {

        ImportantDesignRequirements a1 =
            new ImportantDesignRequirements(1, "Account1", "9876543210", "Savings", 2000);

        a1.displayAccountDetails();
        a1.deposit(5000);
        System.out.println("\nBalance: " + a1.getBalance());
        a1.withdraw(3000);
        System.out.println("\nBalance: " + a1.getBalance());

        a1.setMobileNumber("9999999999");
        System.out.println("\nMobile: " + a1.getMobileNumber());

        a1.deposit(-1000);
        a1.withdraw(-500);
        a1.withdraw(10000);

        ImportantDesignRequirements a2 =
            new ImportantDesignRequirements(2, "Account2", "9123456789", "Current", 3000);

        a2.displayAccountDetails();
        a2.deposit(10000);
        a2.withdraw(5000);
        a2.displayAccountDetails();
    }
}
