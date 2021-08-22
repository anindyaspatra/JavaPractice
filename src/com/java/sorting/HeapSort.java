package com.java.sorting;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 3, 56, 7, 34, 67, 4, 50 };
		HeapSort hs = new HeapSort();
		hs.sort(arr);
		hs.printArray(arr);
		
		
	}
	
	void printArray(int[] arr) {
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
	
	void sort(int[] arr) {
		int length = arr.length;
		
		for(int i=length/2-1;i>=0;i--) {
			heapify(arr,length, i);
		}
		
		for(int i = length-1;i>=0;i--) {
			int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(arr, i, 0);
		}
	}
	
	void heapify(int[] arr,int length, int i) {
		int largest = i;
		int lChildNode = 2*i+1;
		int rChildNode = 2*i+2;
		
		
		if(lChildNode<length && arr[lChildNode]>arr[largest]) {
			largest = lChildNode;
		}
		
		if(rChildNode<length && arr[rChildNode]> arr[largest]) {
			largest = rChildNode;
		}
		
		if(largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			
			heapify(arr, length, largest);
		}
	}

}
