package com.shopping;

public class Item {
    private String itemName;
    private double price;
    private int quantity;
    private String isOnSaleColor;

    public Item(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.isOnSaleColor = "GREEN";
    }

    public Item(String itemName, double price, int quantity, String isOnSaleColor) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.isOnSaleColor = isOnSaleColor;
    }

    public double getPrice() {
        return this.price;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getIsOnSaleColor() {
        return isOnSaleColor;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
