package com.java.concepts;

public class Circle implements ChildInterface{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying Circle Class");
	}

	@Override
	public void newTest() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void test2() {
		ChildInterface.add();
	}

}
