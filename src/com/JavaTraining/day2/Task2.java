package com.JavaTraining.day2;
import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String brand;
    private double baseRate;

    Vehicle(String vehicleNumber, String brand, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    abstract double calculateRentalCost(int days);
}

interface Insurable {
    double getInsuranceCost(int days);
}

class Car extends Vehicle implements Insurable {

    Car(String no, String brand, double rate) {
        super(no, brand, rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getBaseRate() * days;
    }

    @Override
    public double getInsuranceCost(int days) {
        return 500 * days;
    }
}

class Bike extends Vehicle {

    Bike(String no, String brand, double rate) {
        super(no, brand, rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getBaseRate() * days * 0.8;
    }
}

class Truck extends Vehicle implements Insurable {

    Truck(String no, String brand, double rate) {
        super(no, brand, rate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getBaseRate() * days * 1.5;
    }

    @Override
    public double getInsuranceCost(int days) {
        return 1000 * days;
    }
}

class RentalAgency {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    void generateBill(String vehicleNo, int days) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleNumber().equals(vehicleNo)) {

                double rental = v.calculateRentalCost(days);
                double insurance = 0;

                if (v instanceof Insurable)
                    insurance = ((Insurable) v).getInsuranceCost(days);

                System.out.println("\nVehicle: " + v.getBrand());
                System.out.println("Rental Cost: Rs." + rental);
                System.out.println("Insurance: Rs." + insurance);
                System.out.println("Total: Rs." + (rental + insurance));
                return;
            }
        }
        System.out.println("Vehicle not found");
    }
}
public class Task2 {
	public static void main(String[] args) {

        RentalAgency agency = new RentalAgency();

        agency.addVehicle(new Car("C101", "Toyota", 2000));
        agency.addVehicle(new Bike("B101", "Honda", 1000));
        agency.addVehicle(new Truck("T101", "Volvo", 3000));

        agency.generateBill("C101", 3);
        agency.generateBill("B101", 3);
        agency.generateBill("T101", 3);
    }
}


