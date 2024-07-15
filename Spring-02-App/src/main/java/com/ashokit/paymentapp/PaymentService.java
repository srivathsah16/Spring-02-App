package com.ashokit.paymentapp;

public class PaymentService {
	private IPayment payment;

	public PaymentService() {
		System.out.println("PaymentService :: def-Constructor");
	}

	public PaymentService(IPayment payment) {
		System.out.println("PaymentService :: param-Constructor");
		this.payment = payment;
	}
	public void setPayment(IPayment payment) {
		System.out.println("PaymentService :: setPayment method called...");
		this.payment=payment;
	}

	public void doPayment(double billAmt) {
		Boolean status = payment.processPayment(billAmt);
		if (status) {
			System.out.println("Printing Receipt...");
		} else {
			System.out.println("Payment declined...");
		}
	}
}
