package com.jmarket.pos_terminal.transaction;

import java.util.UUID;

public class TransactionItem {
    private String itemId;
    private String itemName;
    private double itemPrice;
    private int quantity;

    public TransactionItem(String itemName, double itemPrice, int quantity) {
        this.itemId = generateUuid();
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    private String generateUuid() {
        return UUID.randomUUID().toString();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return itemPrice * quantity;
    }

    @Override
    public String toString() {
        return "TransactionItem{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", quantity=" + quantity +
                '}';
    }

}