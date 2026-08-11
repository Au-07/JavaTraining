package com.JavaTraining.day2;
import java.util.*;

class person{
	String name;
	String work;
	
	void activity() {
		System.out.println(name + " is working on "+ work );
	}
}

class students extends person{
	String course = "web technologies";
	void activity() {
		super.activity();
		System.out.println(super.name + " is studying about "+course);
	}
}

class child extends students{
	String game = "chess";
	void activity() {
		super.activity();
		System.out.println(super.name + " is playing "+game +" at home");
	}
}

class customer extends child{
	String dish = "cake";
	void activity() {
		super.activity();
		System.out.println(super.name+" is buying ingredients to bake a "+dish);
			
	}
}


class visitor extends customer{
	String job = "traveller";
	void activity() {
		super.activity();
		System.out.println(super.name+" is visiting bali because he is a "+ job);
	}
}
public class MultilevelInherit {
	public static void main(String[] args) {
		visitor v = new visitor();
		v.name = "Cattri";
		v.work = "OOPs";
		v.activity();
	}
	
}
