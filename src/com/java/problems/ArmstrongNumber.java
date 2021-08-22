package com.java.problems;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNum = 153;
		int remainder = 0;
		int reqNum = 0;
		int temp = inputNum;
		
		while(inputNum !=0) {
			remainder = inputNum % 10;
			//System.out.println(remainder*remainder*remainder);
			reqNum = reqNum + remainder*remainder*remainder;
			//System.out.println(reqNum);
			inputNum = inputNum/10;
		}

		if(temp == reqNum) {
			System.out.println("Armstrong number");
		}
	}

}
