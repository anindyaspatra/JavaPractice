package com.java.sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 3, 56, 7, 34, 67, 50 };

	}

	int partition(int[] arr, int lb, int rb) {
		int pivot = arr[lb];
		int start = lb;
		int end = rb;

		while (end > start) {
			if (arr[start] <= pivot) {
				start++;
			}
			if(arr[end]>pivot) {
				end--;
			}
			if(end > start) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		
		int secTemp = arr[lb];
		arr[lb] = arr[end];
		arr[end] = arr[secTemp];
		return end;
	}

}
