package com.jmarket.pos_terminal.transaction;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private String transactionId;
    private String transactionTimestamp;
    private ArrayList<TransactionItem> items;

    public Transaction() {
        this.initializeTransaction();
        this.items = new ArrayList<>();
    }

    public Transaction(ArrayList<TransactionItem> items) {
        this.initializeTransaction();
        this.items = items;
    }

    private void initializeTransaction() {
        this.transactionId = UUID.randomUUID().toString();
        this.transactionTimestamp = LocalDateTime.now().toLocalDate().toString();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public void setTransactionTimestamp(String transactionDate) {
    }

    public ArrayList<TransactionItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<TransactionItem> items) {
        this.items = items;
    }

    public void addItem(TransactionItem item) {
        this.items.add(item);
    }

    public void removeItem(TransactionItem item) {
        this.items.remove(item);
    }

    public void clearItems() {
        this.items.clear();
    }

    public double calculateTotal() {
        double total = 0.0;
        for (TransactionItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", transactionTimestamp='" + transactionTimestamp + '\'' +
                ", items=" + items +
                '}';
    }
}
