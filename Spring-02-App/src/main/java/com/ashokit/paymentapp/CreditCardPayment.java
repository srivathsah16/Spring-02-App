package com.ashokit.paymentapp;

public class CreditCardPayment implements IPayment {
	public CreditCardPayment() {
		System.out.println("CreditCardPayment :: def-constructor");
	}

	@Override
	public boolean processPayment(double billAmt) {
		// business logic to process payment
		System.out.println("Credit Card Payment successful...");
		return true;
	}

}
