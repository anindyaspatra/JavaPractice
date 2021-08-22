package com.java.practice;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1, 3, 4, -1, 4, 3, -1 };
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					BubbleSort.swap(arr, j, j + 1);
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
		
		BubbleSort.print(arr);

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
