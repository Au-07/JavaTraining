package com.JavaTraining.day5;

class Customer2 {
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
  
    private static String bankName = "MARIAMMAN INDIAN BANK";
  
    public Customer2(int accountNumber, String accountHolderName, String mobileNumber, 
                    String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    
    public void displayAccountDetails() {
        System.out.println("====================================");
        System.out.println("       " + bankName);
        System.out.println("====================================");
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Mobile Number    : " + mobileNumber);
        System.out.println("Account Type     : " + accountType);
        System.out.println("Balance          : " + balance);
        System.out.println("====================================");
    }
    
    public static String getBankName() {
        return bankName;
    }
}

public class MainMethodRequirement {
    public static void main(String[] args) {
        Customer2 account1 = new Customer2(1001, "Ana", "9876543210", "Savings", 25000);
        Customer2 account2 = new Customer2(1002, "Kian", "9876501234", "Current", 50000);
        System.out.println("ACCOUNT 1");
        account1.displayAccountDetails();
        System.out.println("\nACCOUNT 2");
        account2.displayAccountDetails();
        
     
    }
}