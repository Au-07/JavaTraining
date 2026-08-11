package com.JavaTraining.day1;
class Student {
    int id;
    String name;
    int m1, m2, m3, m4, m5;
    int total;
    double average;
    char grade;
    void accept(int id, String name, int m1, int m2, int m3, int m4, int m5) {
        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    void calcTot() {
        total = m1 + m2 + m3 + m4 + m5;
    }

    void calcAvg() {
        average = total / 5.0;
    }

    void calcGrade() {
        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class Task1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.accept(1, "Ana", 85, 90, 80, 75, 88);
        s2.accept(2, "Rag", 70, 65, 75, 80, 72);
        s3.accept(3, "Pirate", 95, 92, 90, 96, 94);
        s4.accept(4, "Brink", 60, 70, 65, 68, 72);
        s5.accept(5, "Rahiya", 80, 85, 78, 82, 88);

        s1.calcTot();
        s1.calcAvg();
        s1.calcGrade();

        s2.calcTot();
        s2.calcAvg();
        s2.calcGrade();

        s3.calcTot();
        s3.calcAvg();
        s3.calcGrade();

        s4.calcTot();
        s4.calcAvg();
        s4.calcGrade();

        s5.calcTot();
        s5.calcAvg();
        s5.calcGrade();

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();

        Student high = s1;
        Student low = s1;

        if (s2.total > high.total) high = s2;
        if (s3.total > high.total) high = s3;
        if (s4.total > high.total) high = s4;
        if (s5.total > high.total) high = s5;

        if (s2.total < low.total) low = s2;
        if (s3.total < low.total) low = s3;
        if (s4.total < low.total) low = s4;
        if (s5.total < low.total) low = s5;

        double clsAvg =
                (s1.total + s2.total + s3.total + s4.total + s5.total) / 25.0;

        System.out.println("Highest: " + high.name);
        System.out.println("Lowest: " + low.name);
        System.out.println("Class Average: " + clsAvg);
    }
}