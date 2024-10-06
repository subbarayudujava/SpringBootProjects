package com.nt.subbu.serviceinterface;

public class CreditCardPaymentStrategy {
	public void pay(double amount) {
		System.out.println("CreditCardPaymentStrategy:" + amount + " pay()");
	}
}
