package com.java.coreconcepts;

public abstract class AbstractClass implements IBank {
	public int number;
	public abstract void loan();
	public void interest() {
		System.out.println("Interest in Abstract Class");
	}
	public void nao() {
		System.out.println("New account opening in Abstract Class");
	}
	
	@Override
	public void testIBank() {
		// TODO Auto-generated method stub
		
	}

}
