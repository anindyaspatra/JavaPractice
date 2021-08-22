package com.java.problems;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Oyo";
		String outputString = "";
		
		for(int i = inputString.length()-1; i>=0;i--) {
			outputString = outputString+inputString.charAt(i);
		}
		
		System.out.println(outputString);
		
		if(inputString.equalsIgnoreCase(outputString)) {
			System.out.println("The String is Palindrome");
		}else {
			System.out.println("The String is not Palindrome");
		}
	}

}
