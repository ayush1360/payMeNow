package com.PayMeNow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class PayMeNowApplication {

	public static void main(String[] args) {

		SpringApplication.run(PayMeNowApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount:");
		double amount = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter payment method(Credit, Paypal, BankTransfer):");
		String paymentMethod = sc.nextLine();

		PaymentService paymentService = (PaymentService) context.getBean(paymentMethod + "PaymentService");
		paymentService.processPayment(amount);



	}


}
