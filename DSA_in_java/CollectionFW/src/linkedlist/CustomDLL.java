package linkedlist;

class DLL{
	
	private Node head;
	
	//---------------------------------------------------
	
	//Insert element at first
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}
		head = node;
	}
	
	//---------------------
	
	//insert last , with no given tail
	public void insertLast(int val) {
		Node node = new Node(val);
		Node last = head;
		
		node.next = null;
		
		if(head == null) {
			node.prev = null;
			head = node;
			return;
		}
		
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = node;
		node.prev = last;
	}
	
	//-----------------------
	
	public Node find(int val) {
		Node node = head;
		while(node != null) {
			if(node.val == val) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	//insert at index after this value
	public void insert(int after, int val) {
		Node p = find(after);
		
		if(p == null) {
			System.out.println("doesnt exist");
			return;
		}
		
		Node node = new Node(val);
		node.next = p.next;
		p.next = node;
		node.prev = p;
		if(node.next != null) node.next.prev = node;
			
	}
	
	//--------------------------------------------------------
	
	//display the elements
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val + " <--> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	//------------
	
	//dsiplay in reverse order
	public void displayReverse() {
	    if (head == null) {
	        System.out.println("END");
	        return;
	    }

	    // Step 1: go to the last node (tail)
	    Node temp = head;
	    while (temp.next != null) {
	        temp = temp.next;
	    }

	    // Step 2: traverse backwards using prev
	    while (temp != null) {
	        System.out.print(temp.val + " <--> ");
	        temp = temp.prev;
	    }
	    System.out.println("START");
	}

	
	//----------------------------------------------------------
	
	private class Node{
		
		private int val;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			this.val = value;
		}
		
		public Node(int value, Node next, Node prev) {
			this.val = value;
			this.next = next;
			this.prev = prev;
		}
	}
}

public class CustomDLL {
	
	public static void main(String[] args) {
		
		DLL list = new DLL();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		
		list.display();
		list.displayReverse();
		
		list.insertLast(5);
		list.display();
		
		list.insert(5, 6);
		list.display();
	}

}
