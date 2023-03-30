package com.klinnovations;

public class App {

	public static void main(String[] args) {

		IPayment  p = new CreditCardPayment();
		PaymentService service = new PaymentService(p);
		service.doPayment(500.00);
	}

}
