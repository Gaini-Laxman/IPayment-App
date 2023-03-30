package com.klinnovations;

public class DebitCardPayment implements IPayment {
	@Override
	public boolean processPayment(double billAmt) {
  System.out.println("Debit Card Payment Done....");
		return true;
	}

}
