package com.java.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber = 2;
		boolean flag = false;
		for(int i = 2;i<=inputNumber/2;i++) {
			if(inputNumber%i==0) {
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
		
	}
	

}
