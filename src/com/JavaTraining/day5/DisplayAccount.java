package com.JavaTraining.day5;
class Customer0 {
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    
 
    private static String bankName = "MARIAMMAN INDIAN BANK";
  
    public Customer0(int accountNumber, String accountHolderName, String mobileNumber, 
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
    
    
}

public class  DisplayAccount{
    public static void main(String[] args) {
        Customer0 c = new Customer0(1001, "Ana", "9876543210", "Savings", 25000);
        c.displayAccountDetails();
    }
}
