package com.java.problems;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ParenthesisCheck {
	public static void main (String[] args) {
		System.out.println("Enter");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0){
            String str = scan.next();
            Stack<Character> st = new Stack<>();
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(st.empty())
                    st.push(ch);
                else if(ch == '(' || ch == '{' || ch == '[')
                    st.push(ch);
                else{
                    if(ch == ')' && st.peek()=='(')
                        st.pop();
                    else if(ch == '}' && st.peek()=='{')
                        st.pop();
                    else if(ch == ']' && st.peek()=='[')
                        st.pop();
                    else
                        st.push(ch);
                }
            }
            if(st.empty())
                System.out.println("balanced");
            else
                System.out.println("not balanced");
            
            
        }
	}
	
	
	public void check(String strInput) {
		int size = strInput.length();
		Stack<Character> st = new Stack<>();
		char ch;
		for(int i=0;i<size;i++) {
			ch = strInput.charAt(i);
			if(st.empty()) {
				st.push(ch);
			}else if(ch=='('||ch=='{'||ch=='[') {
				st.push(ch);
			}
		}
	}
}
