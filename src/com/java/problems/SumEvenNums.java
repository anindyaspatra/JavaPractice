package com.java.problems;

public class SumEvenNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumEvenNums.sum(123456);
	}
	
	static void sum(int a) {
		int sum = 0;
		int temp = 0;
		while(a%10!=0) {
			temp = a%10;
			if(temp%2==0) {
				sum = sum+temp;
			}
			a = a/10;
		}
		System.out.println(sum);
	}

}
