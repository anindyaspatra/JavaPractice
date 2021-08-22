package com.java.sorting;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 23, 29, 15, 19, 31, 7, 9, 5, 2 };

		int gap = arr.length / 2;
		int len = arr.length;
		int j;
		
		while(gap>0) {
			for(int i = gap;i<len;i++) {
				int newElement = arr[i];
				j = i;
				while(j>=gap && arr[j-gap]>newElement) {
					arr[j] = arr[j-gap];
					j-=gap;
				}
				arr[j] = newElement;
			}
			gap = gap/2;
		}
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}

}
