package com.JavaTraining.day5;
class bankCust{
	private double balance;
	
	bankCust(double balance) { this.balance = balance ; }
	
	public double  withdraw ( double amount ) {
		if ( amount <= 0 ) System.out.println("Invalid withdrawel amount");
		else if ( amount > balance ) System.out.println("Insufficient balance");
		else {
			balance -= amount;
		}
		return amount;
	}
	
	public double getbalance() { return balance; }
}
public class WithdrawOperation {
	public static void main(String[] args) {
		bankCust b = new bankCust(25000);
		
		System.out.println("Balance : " + b.getbalance());
		System.out.println("Withdraw : "+b.withdraw(10000));
		System.out.println("New Balance : " + b.getbalance());
	}
}
