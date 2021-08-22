package com.java.sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeSort ms = new MergeSort();

		int[] arr = { 12, 3, 56, 7, 34, 67, 50 };
		System.out.println(arr.length);
		ms.divideArray(arr, 0, arr.length - 1);

		ms.printArray(arr);

	}

	void printArray(int[] arr) {
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

	void divideArray(int[] arr, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int middleIndex = (rightIndex + leftIndex) / 2;
			divideArray(arr, leftIndex, middleIndex);
			divideArray(arr, middleIndex + 1, rightIndex);
			mergeArray(arr, leftIndex, middleIndex, rightIndex);

		}
	}

	void mergeArray(int[] arr, int leftIndex, int middleIndex, int rightIndex) {
		// defining the sizes of the temp array
		int size1 = middleIndex - leftIndex + 1;
		int size2 = rightIndex - middleIndex;

		// assiging temp arrays
		int[] lArray = new int[size1];
		int[] rArray = new int[size2];

		for (int i = 0; i < size1; ++i) {
			lArray[i] = arr[leftIndex + i];
		}

		for (int j = 0; j < size2; ++j) {
			rArray[j] = arr[middleIndex + 1 + j];
		}

		int i = 0, j = 0;
		int k = leftIndex;

		while (i < size1 && j < size2) {
			if (lArray[i] <= rArray[j]) {
				arr[k] = lArray[i];
				i++;
			} else {
				arr[k] = rArray[j];
				j++;
			}
			k++;
		}

		while (i < size1) {
			arr[k] = lArray[i];
			i++;
			k++;
		}

		while (j < size2) {
			arr[k] = rArray[j];
			j++;
			k++;
		}
	}
}
