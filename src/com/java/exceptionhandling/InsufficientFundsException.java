package com.java.exceptionhandling;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException() {
		
		System.out.println("Insuffcient Funds");
	}

	public InsufficientFundsException(int amount) {
		
		System.out.println("Insuffcient Funds: "+amount);
	}
}
