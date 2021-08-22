package com.java.recursion;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] arr = { 1, 2, 3, 5, 6, 7, 9, 12 };
		//System.out.println(search(arr, 0, arr.length - 1, 7));
		
		
//		String a = "1234";
//		String b = "1234";
//		String c = new String("1234");
//		
//		System.out.println(a==b);
//		System.out.println(b==c);
//		System.out.println(b.equals(c));
//		System.out.println(c.equals(a));
		
		int i = 0;
		boolean t = true;
		boolean f = false, b;
		b=(t||(i++)==0);
		b=(f||(i+=2)>0);
		System.out.println(i);

	}

	static boolean search(int[] arr, int low, int high, int key) {
		int mid = high + low / 2;// mid = 3, high=7
		boolean flag = false;
		while (low <= high) {
			if (arr[mid] > key) {
				search(arr, low, mid, key);
			} else if (arr[mid] < key) {
				search(arr, mid + 1, high, key);// low = 4, high =7, mid = 5
			} else if (arr[mid] == key) {
				flag = true;
			}
		}
		return flag;
	}

}
