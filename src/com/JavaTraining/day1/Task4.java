package com.JavaTraining.day1;

class employe {

    int empId;
    String empName;
    double basicSal;
    double hra;
    double da;
    double bonus;
    double tax;
    double grossSal;
    double netSal;

    employe(int empId, String empName, double basicSal) {
        this.empId = empId;
        this.empName = empName;
        this.basicSal = basicSal;
    }

    void calcHRA() {
        hra = basicSal * 20 / 100;
    }

    void calcDA() {
        da = basicSal * 10 / 100;
    }

    void calcBonus() {
        bonus = basicSal * 5 / 100;
    }

    void calcGrossSal() {
        grossSal = basicSal + hra + da + bonus;
    }

    void calcTax() {
        tax = grossSal * 8 / 100;
    }

    void calcNetSal() {
        netSal = grossSal - tax;
    }

    void calcSal() {
        calcHRA();
        calcDA();
        calcBonus();
        calcGrossSal();
        calcTax();
        calcNetSal();
    }

    void display() {

        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary : " + basicSal);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Bonus : " + bonus);
        System.out.println("Gross Salary : " + grossSal);
        System.out.println("Tax : " + tax);
        System.out.println("Net Salary : " + netSal);
        System.out.println();
    }
}

public class Task4 {

    public static void main(String[] args) {

        employe e1 = new employe(101, "Aish", 30000);
        employe e2 = new employe(102, "Rahi", 40000);
        employe e3 = new employe(103, "Pirate", 35000);
        employe e4 = new employe(104, "Arin", 50000);
        employe e5 = new employe(105, "Katri", 45000);

        employe[] e = {e1, e2, e3, e4, e5};

        double totSal = 0;

        employe highSal = e1;
        employe lowSal = e1;

        System.out.println(" EMPLOYEE SALARY DETAILS \n");

        for (employe x : e) {

            x.calcSal();
            x.display();

            totSal += x.netSal;

            if (x.netSal > highSal.netSal) {
                highSal = x;
            }

            if (x.netSal < lowSal.netSal) {
                lowSal = x;
            }
        }

        double avgSal = totSal / e.length;

        System.out.println(" SALARY SUMMARY \n");
        System.out.println("Highest Salary Employee : "
                + highSal.empName
                + " - " + highSal.netSal);

        System.out.println("Lowest Salary Employee : "
                + lowSal.empName
                + " - " + lowSal.netSal);

        System.out.println("Average Salary : " + avgSal);
    }
}