package com.java.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BubbleSort bs = new BubbleSort();
		int[] arr = { 12, 3, 56, 7, 34, 67, 4, 50 };
		bs.sortAscending(arr);
		System.out.println("Ascending Order");
		bs.printArray(arr);
		System.out.println();
		int[] arr2 = { 12, 3, 56, 7, 34, 67, 4, 50 };
		System.out.println("Descending Order");
		bs.sortDescending(arr2);
		
		bs.printArray(arr2);
		

	}
	void sortAscending(int [] arr) {
		int temp;
		boolean swapped = false;
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}

		}
	}
	void sortDescending(int[] arr2) {
		int temp;
		boolean swapped = false;
		for (int i = 0; i < arr2.length; i++) {
			swapped = false;
			for (int j = arr2.length - 1; j > i; j--) {
				if (arr2[j] > arr2[j - 1]) {
					temp = arr2[j - 1];
					arr2[j - 1] = arr2[j];
					arr2[j] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
	}
	
	void printArray(int[] arr) {
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
