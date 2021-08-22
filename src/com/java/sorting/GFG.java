package com.java.sorting;

import java.util.Arrays;

public class GFG {

	static void countSort(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int range = max - min + 1;
		int count[] = new int[range];
		int output[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}
		
		for(int i =0;i<count.length;i++) {
			System.out.print(count[i]+" ");
		}
		System.out.println();
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		for(int i =0;i<count.length;i++) {
			System.out.print(count[i]+" ");
		}
		System.out.println();
		
		for (int i = arr.length - 1; i >= 0; i--) {
			output[--count[arr[i] - min]] = arr[i];
			//count[arr[i] - min]--;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	// Driver code
	public static void main(String[] args) {
		int[] arr = {-1,3,4,-1,4,3,-1};//{ -5, -10, 0, -3, 8, 5, -1, 10 };
		countSort(arr);
		printArray(arr);
	}
}
