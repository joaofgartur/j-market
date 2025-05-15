package com.jmarket.pos_terminal.pos_terminal;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PosTerminalApplication {

	public PosTerminalApplication() throws Exception {
		this.run();
	}

	public static void main(String[] args) throws Exception {
		PosTerminalApplication application = new PosTerminalApplication();
	}

	public void run() throws Exception {
		System.out.println("POS Terminal Application is running...");
	}

}
