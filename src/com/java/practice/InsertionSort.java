package com.java.practice;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { -1, 3, 4, -1, 4, 3, -1 };
		
		int key;
		int j;
		
		for(int i = 1; i<arr.length;i++) {
			key = arr[i];
			j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
