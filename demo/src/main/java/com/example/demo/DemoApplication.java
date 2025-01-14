package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		PaymentService paymentService = new PaymentService();
		paymentService.addPaymentMethod("Ananya's Debit Card", new DebitCard("1234", "ananyarsingh"));
		paymentService.addPaymentMethod("Ananya's Credit Card", new CreditCard("1234", "ananyarsingh"));
		paymentService.addPaymentMethod("Ananya's UPI", new UPI("ananya@okici.com"));

		paymentService.makePayment("Ananya's UPI");
		paymentService.makePayment("Ananya's Debit Card");
		SpringApplication.run(DemoApplication.class, args);

	}

}
