package com.JavaTraining.day1;
import java.util.*;
class Employee{
	int roll_no;
	String name;
	double salary;
	
	Employee(int roll_no, String name, double salary ){
		this.roll_no = roll_no;
		this.name = name;
		this.salary = salary;
	}
	/*@Override
	public String toString() {
		return "Roll_no
	}*/
	
}
public class StudentDb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Employee[] list = new Employee[n];
		
		for ( int i = 0 ; i < n ; i++ ) {
			int r = sc.nextInt();
			String nam = sc.next();
			double sal = sc.nextDouble();
			
			list[i] = new Employee(r, nam, sal);
		}
		
		System.out.println(Arrays.toString(list));
		sc.close();
	}
}
