package com.ashokit.paymentapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PaymentApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("paymentAppConfig.xml");
		PaymentService pService = context.getBean(PaymentService.class);
		pService.doPayment(300);
		
	}
}
