package com.klinnovations;

public class PaymentService {
	IPayment payment;
	public PaymentService(IPayment payment) {
    this.payment = payment;
	
	}
	public void doPayment(double billAmt)
	{
		boolean status = payment.processPayment(billAmt);
		if(status) {
			System.out.println("Print Receipt...");
		} else {
			System.out.println("Card Decliened...");
		}
	}
}
