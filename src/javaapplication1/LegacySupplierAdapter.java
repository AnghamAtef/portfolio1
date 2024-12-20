/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mariamsameh
 */
public class LegacySupplierAdapter implements Supplier {
    private LegacySupplier legacySupplier;

    public LegacySupplierAdapter(LegacySupplier legacySupplier) {
        this.legacySupplier = legacySupplier;
    }

    @Override
    public void addSupplier(String name, String type) {
        legacySupplier.addOldSupplier(name, type); // إعادة استخدام الكلاس القديم
    }
}
