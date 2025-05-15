package com.jmarket.pos_terminal.pos_terminal;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jmarket.pos_terminal.transaction.TransactionFactory;

@SpringBootApplication
public class PosTerminalApplication {

	public PosTerminalApplication() throws Exception {
		this.run();
	}

	public static void main(String[] args) throws Exception {
		PosTerminalApplication __ = new PosTerminalApplication();
	}

	public void run() throws Exception {
		System.out.println("POS Terminal Application is running...");

		TransactionFactory transactionFactory = TransactionFactory.getInstance();
		System.out.println("Transaction Factory instance created.");

		for (int i = 0; i < 5; i++) {
			System.out.println("Generating transaction " + (i + 1) + "...");
			System.out.println(transactionFactory.generateNewTransaction());
		}
	}

}
