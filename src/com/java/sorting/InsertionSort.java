package com.java.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 3, 56, 7, 34, 67, 4, 50 };
		InsertionSort is = new InsertionSort();
		is.sortDescending(arr);
		is.printArray(arr);
		System.out.println();
		int[] arr2 = { 12, 3, 56, 7, 34, 67, 4, 50 };
		is.sortAscending(arr2);
		is.printArray(arr2);

	}

	void sortDescending(int[] arr) {
		int key;
		int j;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
	
	void sortAscending(int[] arr) {
		int key;
		int j;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	void printArray(int[] arr) {
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
