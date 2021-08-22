package com.java.problems;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		System.out.println(SumOfNaturalNumbers.add(num));
	}

	static int add(int i) {
		if (i == 0)
			return 0;
		return i + add(i - 1);
	}

}
