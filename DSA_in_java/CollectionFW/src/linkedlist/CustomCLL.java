package linkedlist;

class CLL{
	
	private Node head;
	private Node tail;
	
	public CLL() {
		this.head = null;
		this.tail = null;
	}
	
	//insert at last
	public void insertLast(int value) {
		Node node = new Node(value);
		
		if(head == null) {
			head = node;
			tail = node;
		}
		
		tail.next = node;
		node.next = head;
		tail = node;
	}
	
	//display
	public void display() {
		Node node = head;
		if(head!=null) {
			do {
				System.out.print(node.val + " -> ");
				node = node.next;
			}while(node != head);
		}
		System.out.println("Head");
	}
	
	//delete
	public void delete(int val) {
		Node node = head;
		if(node == null) {
			return;
		}
		
		if(node.val == val) {
			head = head.next;
			tail.next = head;
			return;
		}
		
		do {
			Node n = node.next;
			if(n.val == val) {
				node.next = n.next;
			}
		}while(node != head);
	}
	
	private class Node{
		private int val;
		private Node next;
		
		public Node(int val) {
			this.val = val;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}
}

public class CustomCLL {

	public static void main(String[] args) {
		
		CLL list = new CLL();
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		
		list.display();
		
		list.delete(3);
		list.display();
	}
}
