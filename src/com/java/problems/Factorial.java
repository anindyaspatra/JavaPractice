package com.java.problems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		System.out.println(Factorial.fact(i));
		
		
	}
	
	static long fact(int i) {
		while(i==0) {
			return 1;
		}
		return i* fact(i-1);
	}

}
