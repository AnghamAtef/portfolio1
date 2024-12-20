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
import java.util.Map;
public class InventoryManager {
    private static InventoryManager instance;
    final Map<String, Integer> inventory; // مخزون المنتجات
    private final int MAX_CAPACITY = 100; // الحد الأقصى للمخزون

    // Constructor
    private InventoryManager() {
        inventory = new HashMap<>();
        System.out.println("Inventory Manager initialized!");
    }

    // Singleton Instance
    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    // Add Product to Inventory
    public void addProduct(String productName, int quantity) {
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than 0.");
            return;
        }

        int currentQuantity = inventory.getOrDefault(productName, 0);
        int newQuantity = currentQuantity + quantity;

        if (newQuantity > MAX_CAPACITY) {
            System.out.println("Cannot add product. Exceeds maximum capacity of " + MAX_CAPACITY);
        } else {
            inventory.put(productName, newQuantity);
            System.out.println("Added " + quantity + " units of " + productName + " to inventory.");
        }
    }

    // Get Product Quantity
    public int getProductQuantity(String productName) {
        return inventory.getOrDefault(productName, 0);
    }

    // Print Inventory
    public void printInventory() {
        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
