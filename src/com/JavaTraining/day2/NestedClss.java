package com.JavaTraining.day2;
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
	
	class arvr{
		int mark;
		int code;
		String staff;
		
		arvr(int mark, int code, String staff){
			this.mark = mark;
			this.code = code;
			this.staff = staff;
			
		}	
		
		void dispaly() {
			System.out.println("arvr mark : " + mark);
			System.out.println("arvr code : " + code);
			System.out.println("arvr staff : " + staff);
		}
	}
	
	class web{
		char grade;
		int code;
		String staff;
		web(char grade,int code, String staff){
			this.code = code;
			this.staff = staff;
			this.grade = grade;
			
		}
		void dispaly() {
			System.out.println("web grade : " + grade);
			System.out.println("web code : " + code);
			System.out.println("web staff : " + staff);
		}
		
	}
}
public class NestedClss {
	public static void main(String[] args) {
		student s = new student(1,"shan");
		
		student.arvr a = s.new arvr(99,1001,"Sugantha"); a.dispaly();
		student.web w = s.new web('A',1002,"Manoj"); w.dispaly();
	}

}
