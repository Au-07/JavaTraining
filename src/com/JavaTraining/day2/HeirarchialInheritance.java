package com.JavaTraining.day2;

class Management {
    String instName;
    int totStud;

    Management(String instName, int totStud) {
        this.instName = instName;
        this.totStud = totStud;
    }

    void display() {
        System.out.println("Institution: " + instName);
        System.out.println("Students: " + totStud);
    }
}

class Schools extends Management {
    int teachers;
    int workers;
    int students;

    Schools(String name, int totStud,
            int teachers, int workers, int students) {

        super(name, totStud);
        this.teachers = teachers;
        this.workers = workers;
        this.students = students;
    }

    void calcRatio() {
        double ratio = (double) students / teachers;
        System.out.println("Teacher-Student ratio: 1:" + ratio);
    }
}

class College extends Management {
    int professors;
    int transVeh;
    int students;

    College(String name, int totStud,
            int professors, int transVeh, int students) {

        super(name, totStud);
        this.professors = professors;
        this.transVeh = transVeh;
        this.students = students;
    }

    void calc() {
        double ratio = (double) students / professors;
        System.out.println("Students per professor: " + ratio);
    }
}

class Placement extends Management {
    int staff;
    int companies;
    int studTrained;

    Placement(String name, int totStud,
              int staff, int companies, int studTrained) {

        super(name, totStud);
        this.staff = staff;
        this.companies = companies;
        this.studTrained = studTrained;
    }

    void calculate() {
        double load = (double) studTrained / companies;
        System.out.println("Students per company: " + load);
    }
}

public class HeirarchialInheritance {
    public static void main(String[] args) {

        Schools school = new Schools(
            "ABC School",
            1000,
            50,
            20,
            1000
        );

        College college = new College(
            "XYZ College",
            3000,
            120,
            40,
            3000
        );

        Placement placement = new Placement(
            "XYZ Placement Cell",
            3000,
            10,
            80,
            2500
        );
        school.display();

        school.calcRatio();

        college.display();

        college.calc();

        placement.display();

        placement.calculate();
    }
}

