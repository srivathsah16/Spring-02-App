package com.ashokit.paymentapp;

public class DebitCardPayment implements IPayment {
	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: def-constructor");
	}

	@Override
	public boolean processPayment(double billAmt) {
		//business logic to process payment
		System.out.println("Debit Card Payment successful...");
		return true;
	}

}
