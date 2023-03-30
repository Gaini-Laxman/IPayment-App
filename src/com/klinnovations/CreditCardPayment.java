package com.klinnovations;

public class CreditCardPayment implements IPayment{
	@Override
	public boolean processPayment(double billAmt) {
System.out.println("Credit Card Payment Done....");
		return true;
	}

}
