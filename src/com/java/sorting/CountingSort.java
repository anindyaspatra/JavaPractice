package com.java.sorting;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9 };
		int[] tempArr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] bArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			tempArr[arr[i]]++;
		}
		for(int i = 0;i<tempArr.length;i++) {
			System.out.print(tempArr[i]);
		}
		System.out.println();
		
		for(int i = 1;i<tempArr.length;i++) {
			tempArr[i] = tempArr[i]+tempArr[i-1];
		}
		
		
		for(int i = 0;i<tempArr.length;i++) {
			System.out.print(tempArr[i]+" ");
		}
		System.out.println();
		
		//3 6 10 10 11 12 12 14 15 17 
		
		for(int i = arr.length-1;i>=0;i--) {
			bArr[--tempArr[arr[i]]]=arr[i];
		}

		for(int i =0;i<bArr.length;i++) {
			System.out.print(bArr[i]+" ");
		}
	}

}
