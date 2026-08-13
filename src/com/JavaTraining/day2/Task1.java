package com.JavaTraining.day2;

import java.util.*;
abstract class LibraryItem {
    String title;
    int itemId;
    boolean isAvailable;

    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    void display() {
        System.out.println(
            "Title : " + title +
            " , ItemId : " + itemId +
            " , isAvailable : " + isAvailable
        );
    }

    abstract void getLoanPeriod();
}


class Book extends LibraryItem implements borrowable {
    Book(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    void getLoanPeriod() {
        System.out.println("Book Loan Period : 14 days");
    }

    @Override
    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book " + title + " borrowed.");
        } else {
            System.out.println("Book " + title + " Not Available");
        }
    }

    @Override
    public void returnItem() {

        isAvailable = true;
        System.out.println("Book '" + title + "' returned ");
    }
}

class Magazine extends LibraryItem {
    Magazine(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    void getLoanPeriod() {
        System.out.println("Magazine is reference-only. It cannot be borrowed.");
    }
}


class DVD extends LibraryItem implements borrowable {

    DVD(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    void getLoanPeriod() {
        System.out.println("DVD Loan Period : 7 days");
    }

    @Override
    public void borrowItem() {

        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD " + title + " borrowed.");
        } else {
            System.out.println("DVD " + title + " Not Available.");
        }
    }

    @Override
    public void returnItem() {

        isAvailable = true;
        System.out.println("DVD " + title + " returned.");
    }
}


interface borrowable {
    void borrowItem();
    void returnItem();
}


class Librarian {
    ArrayList<LibraryItem> items = new ArrayList<>();
    void addItem(LibraryItem item) {
        items.add(item);
    }

    void displayAllItems() {
        System.out.println("\nAll Library Items\n");

        for (LibraryItem item : items) {
            item.display();
            item.getLoanPeriod();
            System.out.println();
        }
    }
}



public class Task1 {
    public static void main(String[] args) {
        Book book = new Book("Titans", 101);
        Magazine magazine = new Magazine("Tilaster", 102);
        DVD dvd = new DVD("Maglind", 103);


        Librarian librarian = new Librarian();
        librarian.addItem(book);
        librarian.addItem(magazine);
        librarian.addItem(dvd);


      
        librarian.displayAllItems();

        System.out.println("Borrowing Book ");
        book.borrowItem();

        System.out.println("\nBorrowing DVD ");
        dvd.borrowItem();

        System.out.println("\nAttempting to Borrow Magazine ");

        if (magazine instanceof borrowable) {
            ((borrowable) magazine).borrowItem();
        } else {
            System.out.println(
                "Magazine '" + magazine.title +
                "' cannot be borrowed because it is reference-only."
            );
        }

        System.out.println("\nUpdated Library Items ");
        librarian.displayAllItems();


        System.out.println("Returning Book ");
        book.returnItem();
        
        System.out.println("\nReturning DVD ");
        dvd.returnItem();
    }
}


