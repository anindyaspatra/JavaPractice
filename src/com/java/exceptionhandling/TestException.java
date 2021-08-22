package com.java.exceptionhandling;

public class TestException {

	public static void main(String[] args) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		int amount = 1000;
		if(amount>500)
			throw new InsufficientFundsException();
	}

}
