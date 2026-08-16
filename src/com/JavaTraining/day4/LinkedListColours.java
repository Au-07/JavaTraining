package com.JavaTraining.day4;
import java.util.*;

class colours{
	int id;
	String name;
	boolean fav;
	
	colours(int id , String name , boolean fav){
		this.id = id;
		this.name = name;
		this.fav = fav;
	}
	
	void method() {
		if ( fav ) System.out.println(name + " is my fav colour");
		else System.out.println(name + " is not my fav colour");
	}
}
public class LinkedListColours {
	public static void main(String[] args) {
		colours c1 = new colours(1, "Blue" , true);
		colours c2 = new colours(2, "Black" , true);
		colours c3 = new colours(3, "Yellow" , false);
		colours c4 = new colours(4, "Teal" , true);
		colours c5 = new colours(5, "Brown" , false);
		
		
	}

}
