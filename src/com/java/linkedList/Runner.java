package com.java.linkedList;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(3);
		list.insert(34);
		list.insert(52);
		list.insert(511);
		
		list.show();
		
		list.insertAtStart(45);
		System.out.println();
		list.show();
		
		list.insertAt(33, 0);
		System.out.println();
		list.show();
		
		list.deleteAt(2);
		System.out.println();
		list.show();
		System.out.println();
		list.displayReverseOder(list.head);
		list.isPalindrome(list.head);
	}

}
