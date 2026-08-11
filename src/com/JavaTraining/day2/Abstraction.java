package com.JavaTraining.day2;
import java.util.*;
abstract class bankAcc{
	protected double bal;
	
	bankAcc(double bal){
		this.bal = bal;
	}
	
	abstract void calculateinterest();
	
	void deposit(double amt) {
		bal += amt;
		System.out.println("Deposited : "+amt);
		System.out.println("Balance  : "+ bal);
	}
}

class savingsAcc extends bankAcc{
	savingsAcc(double bal){
		super(bal);
		
	}
	
	void calculateinterest() {
		double interest = bal *  0.02;
		System.out.println("Savings Acc Interest : "+ interest);
	}
	
}
public class Abstraction {
	public static void main(String[] args) {
		bankAcc b = new savingsAcc(7000);
		b.deposit(2000);
		b.calculateinterest();
	}
}
