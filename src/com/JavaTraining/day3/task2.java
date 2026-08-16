package com.JavaTraining.day3;
abstract class Employee {
    private int id;
    private String name;
    private double basicSalary;

    Employee() {
        this(0, "Unknown", 0);
    }

    Employee(int id, String name) {
        this(id, name, 0);
    }

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("\nAccount Id : " + id + "\nAccount Holder Name : " + name +
                "\nFinal Salary: Rs." + calculateSalary());
    }
}

class Doctor extends Employee {
    private double consultationAllowance;

    Doctor(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        consultationAllowance = allowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + consultationAllowance;
    }
}

class Nurse extends Employee {
    private double nightShiftAllowance;

    Nurse(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        nightShiftAllowance = allowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + nightShiftAllowance;
    }
}

class LabTechnician extends Employee {
    private double labAllowance;

    LabTechnician(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        labAllowance = allowance;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + labAllowance;
    }
}
public class task2 {
	 public static void main(String[] args) {

	        Employee[] employees = {
	            new Doctor(101, "Ana", 50000, 10000),
	            new Nurse(102, "Priya", 30000, 5000),
	            new LabTechnician(103, "Ravi", 35000, 7000)
	        };

	        Employee highest = employees[0];

	        for (Employee e : employees) {
	            e.displayDetails();      

	            if (e.calculateSalary() > highest.calculateSalary())
	                highest = e;
	        }

	        System.out.println("\nHighest Paid: " + highest.getName()
	                + " - Rs." + highest.calculateSalary());
	    }
}



