/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mariamsameh
 */
public class Main {
    public static void main(String[] args) {
        InventoryManager manager = InventoryManager.getInstance();

        // إضافة منتجات إلى المخزون
        manager.addProduct("Laptop", 50);
        manager.addProduct("Phone", 30);
        manager.addProduct("Laptop", 60); // سيتجاوز الحد الأقصى

        // طباعة المخزون الحالي
        manager.printInventory();

        // الحصول على كمية منتج معين
        int laptopQuantity = manager.getProductQuantity("Laptop");
        System.out.println("Quantity of Laptops: " + laptopQuantity);
    }
    
}
