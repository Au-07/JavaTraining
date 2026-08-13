package com.JavaTraining.day3;

class bank{
	int balance;
	
	bank( int balance ){
		this.balance = balance;
	}
	
	void withdraw(int amount) {
        if (amount > balance) {
            throw new RuntimeException("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
	}
}

public class tthrowException {
	public static void main(String[] args) {
        bank account = new bank(300);
        account.withdraw(400);
	}
}
