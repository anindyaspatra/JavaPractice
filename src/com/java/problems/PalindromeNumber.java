package com.java.problems;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNum = 132131;
		int temp = inputNum;
		int revNum = 0;
		int i;
		
		while(temp>0) {
			revNum = revNum*10+temp%10;
			temp = temp/10;
		}
		System.out.println(revNum);
		if(inputNum == revNum) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}
	}

}
