package com.java.recursion;

public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		Divide d = new Divide();
		System.out.println(d.testDivide(a));
		a = 10;
		System.out.println(d.binary(a));
		a = 10;
		System.out.println(d.intBinary(a));
	}

	String binary(int y) {
		int a;
		if (y > 0) {
			a = y % 2;
			return (binary(y / 2) + "" + a);
		}
		return "";
	}

	int intBinary(int y) {
		int a;
		if (y > 0) {
			a = y % 2;
			return (a) + 10*intBinary(y / 2);
		}
		return y;
	}

	int testDivide(int a) {
		int sum = 0;
		if (a > 0) {
			System.out.println("A:" + a % 2);
			sum = sum * 10 + a % 2;
			testDivide(a / 2);
			return sum;
		}
		return sum;
	}

}
