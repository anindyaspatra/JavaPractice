package com.java.problems;

import java.util.Arrays;

public class NobleInteger {

	public static void main(String[] args) {
		int[] arr = { 10, 3, 20, 40, 2 };
		int Noble = nobleInteger(arr);
		if(Noble!=-1) {
			System.out.println(Noble);
		}else {
			System.out.println(Noble);
		}
	}

	static int nobleInteger(int[] arr) {
		int a = 0;
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == arr.length-1-i) {
				return arr[i];
			}
		}
		
		
		return -1;
	}
}
