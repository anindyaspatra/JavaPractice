package com.java.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 3, 56, 7, 34, 67, 4, 50 };
		SelectionSort ss = new SelectionSort();
		ss.ascendingSort(arr);
		ss.printArray(arr);
		System.out.println();
		int[] arr2 = { 12, 3, 56, 7, 34, 67, 4, 50 };
		ss.descendingSort(arr2);
		ss.printArray(arr2);

	}

	void descendingSort(int[] arr) {
		int index = 0;
		int minVal;
		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] < arr[j]) {
					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;

		}
	}

	void ascendingSort(int[] arr) {
		int index = 0;
		int minVal;
		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] > arr[j]) {

					index = j;
				}
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int[] arr) {
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
