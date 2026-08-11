package com.JavaTraining.day2;
interface Area {
    double area();
}

interface Perimeter {
    double perimeter();
}

class Shape {
    String name;
    Shape(String name) {
        this.name = name;
    }
}

class Circle extends Shape implements Area, Perimeter {
    double r;
    Circle(double r) {
        super("Circle");
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

class Rect extends Shape implements Area, Perimeter {
    double l, w;
    Rect(double l, double w) {
        super("Rectangle");
        this.l = l;
        this.w = w;
    }
    public double area() {
        return l * w;
    }
    public double perimeter() {
        return 2 * (l + w);
    }
}

class Calculator {
    void area(Area x) {
        System.out.println(x.area());
    }
    void perimeter(Perimeter x) {
        System.out.println(x.perimeter());
    }
}

public class shapestask {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Circle circle = new Circle(5);
        Rect rect = new Rect(10, 5);

        c.area(circle);
        c.perimeter(circle);

        c.area(rect);
        c.perimeter(rect);
    }
}
