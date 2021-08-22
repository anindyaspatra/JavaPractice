package com.java.problems;

import java.util.Stack;

public class StringReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Anindya Sundar Patra";
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i<str.length();i++) {
			st.push(str.toLowerCase().charAt(i));
		}
		
		for(int i = 0; i<str.length();i++) {
			System.out.print(st.pop());
		}
		
		
	}

}
