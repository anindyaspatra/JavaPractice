package com.java.learnConcepts;

import java.util.HashSet;
import java.util.Set;

public class TestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String inputString = "aaabbbcccaaa";
//		System.out.println(inputString);
		String inputString = "My name is Anindya Sundar Patra";
		inputString = inputString.toLowerCase();
		char c;

		Set<Character> uniqueSet = new HashSet<>();

		for (int i = 0; i < inputString.length(); i++) {
			c = inputString.charAt(i);
			if (c != ' ') {
				uniqueSet.add(c);
			}
		}

		for (char ch : uniqueSet) {
			System.out.println(ch);
		}

		char[] charArray = inputString.toCharArray();
	
		for(char charc : charArray) {
			
		}
	}

//	(
//
//	String inputString)
//	{
//		String outputString = "";
//		char charac;
//		int count = 1;
//		char oldChar = 0;
//
//		for (int i = 0; i < inputString.length(); i++) {
//			count = 1;
//			charac = inputString.charAt(i);
//			if (charac != oldChar) {
//				for (int j = i + 1; j < inputString.length(); j++) {
//					if (charac == inputString.charAt(j)) {
//						count++;
//					} else {
//						outputString = outputString + Character.toString(charac) + count;
//						break;
//					}
//				}
//			}
//			System.out.println(Character.toString(oldChar));
//			oldChar = charac;
//		}
//
//	}

}
