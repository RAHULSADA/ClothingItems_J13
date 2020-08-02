package com.company.model;

public class ClothingItem {

    public static final String SHIRT = "Shirt";
    public static final String PANT = "Pant";
    public static final String HAT = "Hat";

    private String type;
    private ClothingSize size;
    private int quantity;
    private double price;

    public ClothingItem(String type, ClothingSize size, int quantity, double price) {
        this.type = type;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
