/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mariamsameh
 */

public abstract class Product {
    protected String name;
    protected String category;
    protected double price;

    public abstract void displayDetails();
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        this.name = name;
        this.category = "Electronics";
        this.price = price;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + name + " | Price: " + price);
    }
}

class Furniture extends Product {
    public Furniture(String name, double price) {
        this.name = name;
        this.category = "Furniture";
        this.price = price;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + name + " | Price: " + price);
    }
}

class ProductFactory {
    public static Product createProduct(String category, String name, double price) {
        switch (category) {
            case "Electronics":
                return new Electronics(name, price);
            case "Furniture":
                return new Furniture(name, price);
            default:
                throw new IllegalArgumentException("Unknown product category: " + category);
        }
    }
}
