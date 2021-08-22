package com.java.concepts;

public class ChildClass extends AbstractClass {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("inside test child class");
	}

	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		cc.test();
		cc.x = 5;

		System.out.println(cc.x);
	}

}
