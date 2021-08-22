package com.java.practice;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr = {-1,3,4,-1,4,3,-1};//{ 2, 1, -1, 0, 2, 5, 4, 0, 2, 8, -7, 7, 9, 2, 0, 1, 9 };
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		int range = max - min + 1;
		int[] count = new int[range];
		int[] output = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] = count[i] + count[i - 1];
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			output[--count[arr[i] - min]] = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

}
