package com.JavaTraining;
import java.util.*;

class student{
	int rollno;
	String Name;
	
	student(int rollno , String Name){
		this.rollno = rollno;
		this.Name = Name;
		System.out.println("Name : " + Name);
		System.out.println("Rollno : " + rollno);
		
	}
	
	class math{
		int mark;
		
		math(int mark){
			this.mark = mark;
			System.out.println("Math mark : " + mark);
		}	
	}
	
	class java{
		char grade;
		java(char grade){
			this.grade = grade;
			System.out.println("Java Grade : " + grade);
		}
		
	}
}
public class NestedClss {
	public static void main(String[] args) {
		student s = new student(1,"shan");
		
		student.math m = s.new math(99);
		student.java j = s.new java('A');
	}

}
