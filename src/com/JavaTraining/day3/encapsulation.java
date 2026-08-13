package com.JavaTraining.day3;

abstract class employeee{
	private String name;
	private double salary;
	
	public String getName() {return name; }
	public double getSalary() {return salary;}
	public void setName(String name) { this.name = name; }
	public void setSalary(double salary) {this.salary = salary; }
	
	abstract double Bonus_cal();
	abstract void display_All();
	
}


class developer extends employeee{
	String role;
	developer(String role) { this.role = role; }
	
	@Override
    double Bonus_cal() {
		if ( role.equals("Full Stack")) {
		    return getSalary() * 0.10;
		}else {
			return getSalary() * 0.07;
		}
    
    }

    @Override
    void display_All() {
        System.out.println("\n"+role+" Developer");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Salary + Bonus : "+(Bonus_cal() + getSalary()));
    }
}

class manager extends employeee{
	@Override
	double Bonus_cal() {
		 return getSalary() * 0.20;
	}
	@Override
    void display_All() {
        System.out.println("\nManager");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Salary + Bonus : "+(Bonus_cal()+getSalary()));
    }
}
	
class officeWorker extends employeee{
	@Override
	double Bonus_cal() {
		return getSalary() * 0.05;
	}
	@Override
    void display_All() {
        System.out.println("\nOffice Worker");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Salary + Bonus : "+(Bonus_cal()+getSalary()));
    }
}
public class encapsulation {
	public static void main(String[] args) {
		developer d = new developer("Full Stack");
		d.setName("Mano"); d.setSalary(20000);
		d.display_All();
		
		developer d1 = new developer("Mean Stack"); 
		d1.setName("Rahi"); d1.setSalary(15000);
		d1.display_All();
		
		manager m = new manager(); 
		m.setName("Raya"); m.setSalary(30000);
		m.display_All();
		
		officeWorker o =  new officeWorker(); 
		o.setName("Kasi"); o.setSalary(10000);
		o.display_All();
		
	}
}
