/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mariamsameh
 */
import java.util.HashMap;

public class ProductDatabase {
    private static final HashMap<String, Double> products = new HashMap<>();

    static {
        // إضافة بعض المنتجات والأسعار كمثال
        products.put("Laptop", 1500.00);
        products.put("Chair", 120.00);
        products.put("Phone", 800.00);
        products.put("Table", 200.00);
    }

    // البحث عن سعر المنتج
    public static Double getPrice(String productName) {
        return products.get(productName);
    }
}
