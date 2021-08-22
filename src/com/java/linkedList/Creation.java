package com.java.linkedList;

public class Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creation sList = new Creation();    
        
        //Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4);    
            
        //Displays the nodes present in the list    
        sList.display(); 
	}
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head==null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next=newNode;
			tail = newNode;
		}
	}
	
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of Linked List");
		while(current!=null) {
			System.out.print(current.data+", ");
			current = current.next;
		}
		System.out.println();
	}

}
