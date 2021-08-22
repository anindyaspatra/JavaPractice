package com.java.linkedList;

public class LinkedList {

	Node head;

	public void insert(int data) {
		Node node = new Node(data);
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node(data);
		node.next = null;
		node.next = head;

		head = node;
	}

	public void insertAt(int data, int index) {
		Node node = new Node(data);
		node.next = null;
		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node n1 = null;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
		System.out.print(node.data);
	}

	public void displayReverseOder(Node current) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			if (current.next == null) {
				System.out.print(current.data);
				return;
			}
			displayReverseOder(current.next);
			System.out.print(" -> " + current.data);
		}
	}

	//1,2,3,4,4,3,2,1
	public boolean isPalindrome(Node current) {
		boolean flag = false;
		int size = 0;
		if (current == null) {
			System.out.println("List is empty");
		} else {
			while (current.next != null) {
				current = current.next;
				size++;
			}
			size++;
		}
		System.out.println();
		System.out.println(size);
		
		int mid = (size%2==0)?(size/2):((size+1)/2);
		System.out.println(mid);
		return flag;

	}
	
	public Node reverseList(Node temp) {
		Node current = temp;
		Node prevNode = null, nextNode = null;
		
		while(temp.next!=null) {
			
		}
		
			
		return nextNode;
	}
}
