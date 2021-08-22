package com.java.practice;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { -1, 3, 4, -1, 4, 3, -1 };
		int minIndex;

		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			SelectionSort.swap(arr,i, minIndex);
		}
		SelectionSort.print(arr);
	}
	
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
