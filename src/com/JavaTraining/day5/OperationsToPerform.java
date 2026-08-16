package com.JavaTraining.day5;

public class OperationsToPerform {
	static class BankAccount {
	    int accNo;
	    String name, mobile;
	    double balance;

	    BankAccount(int accNo, String name, String mobile, double balance) {
	        this.accNo = accNo;
	        this.name = name;
	        this.mobile = mobile;
	        this.balance = balance;
	    }

	    void details() {
	        System.out.println("Account No : " + accNo + "\nAccount Holder Name : " + name + "\nMobile Number : " + mobile + "\nBalance : Rs." + balance + "\n");
	    }

	    void deposit(double amt) {
	        if (amt > 0) balance += amt;
	        else System.out.println("Invalid deposit");
	    }

	    void withdraw(double amt) {
	        if (amt <= 0) System.out.println("Invalid withdrawal");
	        else if (amt > balance) System.out.println("Insufficient balance");
	        else balance -= amt;
	    }

	    
	}
	public static void main(String[] args) {

        BankAccount a1 = new BankAccount(1, "Account1", "9876543210", 2000);
        a1.details();
        a1.deposit(5000);
        System.out.println("Balance: " + a1.balance);
        a1.withdraw(3000);
        System.out.println("Balance: " + a1.balance);

        a1.mobile = "9999999999";
        System.out.println("Mobile: " + a1.mobile);

        a1.deposit(-1000);
        a1.withdraw(-500);
        a1.withdraw(10000);
        BankAccount a2 = new BankAccount(2, "Account2", "9123456789", 3000);

        a2.details();
        a2.deposit(10000);
        a2.withdraw(5000);
        a2.details();
    }
}
