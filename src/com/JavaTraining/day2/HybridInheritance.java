package com.JavaTraining.day2;
import java.util.*;

class gameCharac{
	String name;
	
	gameCharac(String name){
		this.name = name;
	}
	
	void dispaly() {
		System.out.println("the Game Character is "+name);
	}
}

class player extends gameCharac{
	player(String name){
		super(name);
	}
}

class warrior extends player{
	warrior(String name){
		super(name);
	}
	
	void attack() {
		System.out.println(name + " attacks with a sword");
	}
}

class mage extends player{
	mage(String name){
		super(name);
	}
	
	void cast() {
		System.out.println(name+" casts a spell");
	}
}

interface flyable{
	void fly();
}

interface attackable{
	void spclAttack();
}

class spclWarrior extends warrior implements flyable , attackable{
	spclWarrior(String name){
		super(name);
	}
	
	@Override
	public void fly() {
		System.out.println(name+" can fly");
	}
	
	public void spclAttack() {
		System.out.println(name+ " has special attack invisibility");
	}
	
}
public class HybridInheritance {
	public static void main(String[] args) {
		spclWarrior charc = new spclWarrior("Mackaryn");

        charc.dispaly();
        charc.attack();
        charc.fly();
        charc.spclAttack();

        mage m = new mage("Cedric");

        m.dispaly();
        m.cast();
	}
}
