package com.JavaTraining.day3;
class parent{
	void work(){
		System.out.println("Earning money");
	}
}

class child extends parent{
	@Override
	void work() {
		super.work();
		System.out.println("Spending money");
	}
}
public class polymorphosim {
	public static void main(String[] args) {
		child c = new child(); c.work();
		
	}
}
