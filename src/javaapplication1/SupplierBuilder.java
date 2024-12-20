/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mariamsameh
 */
public class SupplierBuilder {
    private String name;
    private String type;
    private String contactNumber;

    private SupplierBuilder(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.contactNumber = builder.contactNumber;
    }

    public static class Builder {
        private String name;
        private String type;
        private String contactNumber;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public SupplierBuilder build() {
            return new SupplierBuilder(this);
        }
    }

    public void displaySupplier() {
        System.out.println("Supplier: " + name + ", Type: " + type + ", Contact: " + contactNumber);
    }
}
