package com.java.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class NumberOfOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "My Name is Anindya Sundar Patra".replaceAll(" ", "").toLowerCase();
		char[] charaters = inputString.toCharArray();
		Set<Character> setChar = new HashSet<>();
		
		//Adding characters in set Method 1
		for(int i = 0;i<inputString.length();i++) {
			setChar.add(inputString.charAt(i));
		}
		
		//Adding characters in set Method 2
		for(char character : charaters) {	
			setChar.add(character);
		}
		
		//Getting count
		
		
		for(Character eachChar: setChar) {
			int count = 0;
			for(char character : charaters) {
				if(eachChar == character) {
					count++;
				}
			}
			System.out.println(eachChar + ":"+count);
		}
		NumberOfOccurences nc = new NumberOfOccurences();
		nc.countOccurances(inputString);
	}
	
	public void countOccurances(String strInput) {
		HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();
		
		char [] charArray = strInput.toCharArray();
		
		for(char ch:charArray) {
			if(occurences.containsKey(ch)) {
				occurences.put(ch,occurences.get(ch)+1);
			}else {
				occurences.put(ch, 1);
			}
		}
		
		System.out.println(occurences);
		
		
		
		
	}
	
	public void cOccurences(String inputString) {
		
	}

}
