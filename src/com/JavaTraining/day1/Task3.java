package com.JavaTraining.day1;

class Product {

    int pId;
    String pName;
    double price;
    int quant;

    Product(int pId, String pName, double price, int quant) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.quant = quant;
    }

    double calcTotal() {
        return price * quant;
    }

    double discount(double sTotal,double discount) {
        return sTotal * discount / 100;
    }

    void display() {
        System.out.println("Product ID   : " + pId);
        System.out.println("Product Name : " + pName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quant);
        System.out.println("Product Total: " + calcTotal());
        System.out.println();
    }
}

public class Task3 {

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Mouse", 800, 2);
        Product p3 = new Product(103, "Keyboard", 1500, 1);
        Product p4 = new Product(104, "Monitor", 12000, 2);
        Product p5 = new Product(105, "Headphones", 2500, 3);

        Product[] products = {p1, p2, p3, p4, p5};

        double sTotal = 0;
        int totalItems = 0;

        Product Expensive = p1;
        Product cheap = p1;
        Product highQuant = p1;

        System.out.println(" PRODUCT BILL \n");

        for (Product p : products) {

            p.display();

            sTotal += p.calcTotal();
            totalItems += p.quant;

            if (p.price > Expensive.price) {
                Expensive = p;
            }

            if (p.price < cheap.price) {
                cheap = p;
            }

            if (p.quant > highQuant.quant) {
                highQuant = p;
            }
        }

        double discount = p1.discount(sTotal,10);
        double afterDisc = sTotal - discount;

        double gst = afterDisc * 18 / 100;

        double bill = afterDisc + gst;

        System.out.println(" BILL SUMMARY ");
        System.out.println("Subtotal       : " + sTotal);
        System.out.println("Discount (10%) : " + discount);
        System.out.println("GST (18%)      : " + gst);
        System.out.println("Final Bill     : " + bill);

        System.out.println("\n PRODUCT ANALYSIS ");
        System.out.println("Most Expensive : " + Expensive.pName);
        System.out.println("Cheapest       : " + cheap.pName);
        System.out.println("Highest Quantity: " + highQuant.pName);
        System.out.println("Total Items    : " + totalItems);
    }
}