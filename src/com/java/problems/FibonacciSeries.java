package com.java.problems;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		for (int i = 0; i < number; i++) {
			System.out.print(FibonacciSeries.fibo(i)+" ");
		}
	}

	static int fibo(int num) {
		if(num == 0)
			return 0;
		else if (num == 1) {
			return 1;
		}
		return (fibo(num - 1) + fibo(num - 2));
	}
}
