package com.java.practice;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 3, 20, 34, 12, 72, 8, 2 };
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, arr.length-1);
		qs.print(arr);
	}

	void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	int partition(int[] arr, int lBound, int uBound) {
		int pivot = arr[lBound];
		int start = lBound;
		int end = uBound;
		//boolean flag = false;

		while (start < end) {
			///flag = false;
			while (arr[start] <= pivot) {
				start++;
				//flag = true;
				if (start == arr.length) {
					break;
				}
			}
			//flag = false;
			while (arr[end] > pivot) {
				end--;
				//flag = true;
				if (end < 0) {
					break;
				}
			}

			if (start < end) {
				swap(arr, start, end);
			}
		}
		swap(arr, lBound, end);
		return end;
	}

	void sort(int[]arr, int lBound, int uBound) {
		if(lBound< uBound) {
			int partition = partition(arr, lBound, uBound);
			sort(arr, lBound, partition-1);
			sort(arr, partition+1, uBound);
		}
	}
}
