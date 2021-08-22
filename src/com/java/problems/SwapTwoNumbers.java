package com.java.problems;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		SwapTwoNumbers sn = new SwapTwoNumbers();
		// TODO Auto-generated method stub
		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers: ");

		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swap:");
		System.out.println("a: " + a + ", b: " + b);
		sn.swapWithoutTemp2(a, b);
	}

	void swapWithoutTemp1(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a: " + a + ", b: " + b);
	}

	void swapWithoutTemp2(int a, int b) {
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After Swap:");
		System.out.println("a: " + a + ", b: " + b);
	}

	void SwapWithTemp(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap:");
		System.out.println("a: " + a + ", b: " + b);
	}
}
