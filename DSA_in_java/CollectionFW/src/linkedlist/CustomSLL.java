package linkedlist;

class LL{ //should be public but here i am just using default class, LL is to create object since Node class implementation is private
	
	private Node head;
	private Node tail;
	
	private int size;
	
	public LL() {
		this.size = 0;
	}
	
	//-----------------------------------------------------------------------
	//Other methods will be defined here
	
	// to insert element at first
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		//if list is empty and this is the first element then head = tail
		if(tail == null) {
			tail = head;
		}
		
		size+=1;
	}
	
	//-----------------------------------------------------------------------
	
	//Find the element that has the given value;
		public Node find(int value) {
			Node node = head;
			while(node!=null) {
				if(node.val == value) return node;
				node = node.next;
			}
			return null;
		}
	
		// Find index of element with given value
		public int findIndex(int value) {
		    Node node = head;
		    int index = 0;

		    while (node != null) {
		        if (node.val == value) {
		            return index;   // element found
		        }
		        node = node.next;
		        index++;
		    }

		    return -1; // element not found
		}
	
	//-----------------------------------------------------------------------
	
	//Insert element at last
	public void insertLast(int val) {
		if(tail == null) insertFirst(val);
		
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}
	
	//-----------------------------------------------------------------------
	
	//insert elements at given index
	public void insertAtIndex(int val, int index) {

		if(index == 0) {
			insertFirst(val);
			return;
		}
		
		if(index == size) {
			insertLast(val);
			return;
		}
		
		Node temp = head;
		for(int i=1; i<index; i++) {
			temp = temp.next;
		}
		
		Node node = new Node(val, temp.next);
		temp.next=node;
		
		size++;
	}
	
	//---------------------------------------
	
	//recursive insertion
	public void insertRec(int val, int index) {
		head = insertRec(val, index, head);
	}
	
	private Node insertRec(int val, int index, Node node) {
		if(index == 0) {
			Node temp = new Node(val, node);
			size++;
			return temp;
		}
		
		node.next = insertRec(val, index-1, node.next);
		return node;
	}
	
	//-----------------------------------------------------------------------
	
	//delete first element
	public int deleteFirst() {
		int val = head.val;
		head = head.next;
		if(head == null) tail = null;
		size--;
		return val;
	}
	
	//-----------------------------------------------------------------------
	
	//to get the element at size-2 index and make it tail and delete the last element
	public Node get(int index) {
		Node node = head;
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		return node;
	}
	
	//delete last element
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		
		Node secondLast = get(size-2);
		int val = tail.val;
		tail = secondLast;
		tail.next = null;
		size--;
		return val;
	}
	
	//-----------------------------------------------------------------------
	
	//delete element at a index
	public int delete(int index) {
		if(index == 0) return deleteFirst();
		if(index == size - 1) return deleteLast();
		
		Node prev = get(index - 1);
		int val = prev.next.val;
		prev.next = prev.next.next;
		
		return val;
	}
	
	//-----------------------------------------------------------------------
	
	//to display elements
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		
		System.out.println("END");
	}
	
	//-----------------------------------------------------------------------
	
	private class Node{
		private int val;
		private Node next;
		
		public Node(int value) {
			this.val = value;
		}
		
		public Node(int value, Node next) {
			this.next = next;
			this.val = value;
		}
	}
	
}

public class CustomSLL {
	
	public static void main(String[] args) {

		LL list = new LL();
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(1);
		list.insertFirst(8);
		list.insertFirst(9);
		
		list.display(); //9 -> 8 -> 1 -> 4 -> 3 -> END
//
		list.insertLast(7);
		list.display(); //9 -> 8 -> 1 -> 4 -> 3 -> 7 -> END
//		
		list.insertAtIndex(12, 3);
		list.display();
		
		System.out.println(list.deleteFirst());
		list.display();
		
		System.out.println(list.deleteLast());
		list.display();
		
		System.out.println(list.delete(1));
		list.display();
		
		System.out.println(list.find(4));
		System.out.println(list.findIndex(4));
		
		list.insertRec(5, 2);
		list.display();
	}

}
