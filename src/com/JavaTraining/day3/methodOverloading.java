package com.JavaTraining.day3;
class shapes{
	void area() {
		System.out.println("area of the shapes");
		
	}
	
	void area(int x) {
		System.out.println("Area of square : " + x*x);
	}
	
	void area(int a , int b) {
		System.out.println("Area of rectangle : " + a*b);
		
	}
	
	void area(float a , int h , int b) {
		System.out.println("area of triangle : "+a*b*h);
	}
	
	void area(double p , int x) {
		System.out.println("Area of circle : "+p*x*x);
	}
}
public class methodOverloading {
	public static void main(String[] args) {
		shapes s = new shapes();
		s.area();
		s.area(7);
		s.area(17,16);
		s.area(1.5f,7,9);
		s.area(3.14,9);
		
	}
}
