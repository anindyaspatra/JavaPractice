package linkedList;


public class LinkedList {

	Node head;
	
	public void createList(int data) {
		Node node = new Node(data);
		node.next = null;
		
		if(head == null) {
			head.next = node;
		}
	}
}
