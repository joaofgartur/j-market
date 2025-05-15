package com.jmarket.pos_terminal.transaction;

public final class TransactionFactory {
    private static TransactionFactory instance;

    private TransactionFactory() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static TransactionFactory getInstance() {
        if (instance == null) {
            instance = new TransactionFactory();
        }
        return instance;
    }

    public Transaction generateNewTransaction() {
        Transaction transaction = new Transaction();
        int numberOfItems = (int) (Math.random() * 10) + 1;

        for (int i = 0; i < numberOfItems; i++) {
            transaction.addItem(generateNewTransactionItem());
        }

       return transaction;
    }

    private TransactionItem generateNewTransactionItem() {

        String itemName = generateString();
        double itemUnitaryPrice = Math.random() * 100;
        int quantity = (int) (Math.random() * 10) + 1;

        return new TransactionItem(itemName, itemUnitaryPrice, quantity);
    }

    private String generateString() {
        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        StringBuilder itemName = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int randomIndex = (int) (Math.random() * alphabet.length);
            itemName.append(alphabet[randomIndex]);
        }
        return itemName.toString();
    }
}
