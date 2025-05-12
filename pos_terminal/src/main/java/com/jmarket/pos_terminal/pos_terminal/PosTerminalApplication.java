package com.jmarket.pos_terminal.pos_terminal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PosTerminalApplication {

	public PosTerminalApplication() throws Exception {
		this.run();
	}

	public static void main(String[] args) throws Exception {
		PosTerminalApplication app = new PosTerminalApplication();
		// SpringApplication.run(PosTerminalApplication.class, args);
	}

	public void run() throws Exception {
		// This method can be used to execute code after the application has started
		// For example, you can initialize some data or perform some setup tasks
		System.out.println("POS Terminal Application is running...");
		// Add your custom logic here
		// ...
	}
	// You can also define other beans or components here if needed

}
