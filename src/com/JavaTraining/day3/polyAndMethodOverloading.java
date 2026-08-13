package com.JavaTraining.day3;
class bankacc{
	void deposit(double amt){
		System.out.println("Amount deposited : "+amt);
	
	}
	
	void deposit(double amt , String desc) {
		System.out.println("Amount deposited : "+amt +"\n Description : "+desc);
	
	}
	
	void deposit(double amt , String desc , int id_no) {
		System.out.println("Amount deposited : "+amt+"\n Description : "+desc+"\n Id : "+id_no);
	
	}
}

class saving extends bankacc{
	void int_calc(double amt) {
		System.out.println("Savings interest : "+ amt * 0.06);
	}
}

class current extends bankacc{
	void int_calc(double amt) {
		System.out.println("Current interest : "+ amt * 0.02);
	}
}
public class polyAndMethodOverloading {
	public static void main(String[] args) {
		saving s = new saving();
		s.deposit(5000,"Savings Fund");
		s.int_calc(5000);
		
		current c = new current();
		c.deposit(7000,"Current funds",101);
		c.int_calc(7000);
	}

}
