package com.java.problems;

public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 3, 56, 7, 34, 67, 4, 50 };
		//12 3 56 7 34 67 4 50
		//12 3 56 7 34 67 50 4
		//12 3 56 7 67 34 50 4
		//12 3 56 67 7 34 50 4
		//12 3 67 56 7 34 50 4
		//12 67 3....
		//67 12 3..
		
		
		int count=0;
		while(count<=2) {
			count++;
			int tempIndex = arr.length-1;
			while(tempIndex>0) {
				if(arr[tempIndex]<arr[tempIndex-1]) {
					int temp = arr[tempIndex];
					arr[tempIndex] = arr[tempIndex-1];
					arr[tempIndex-1] = temp;
				}
				tempIndex--;
			}
		}
		
		for (int i = 0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
