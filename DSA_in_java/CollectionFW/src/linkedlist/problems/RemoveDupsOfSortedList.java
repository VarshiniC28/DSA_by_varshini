package linkedlist.problems;


class LL{
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	//InSERT 
	
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
	
	public void insertLast(int val) {
		if(tail == null) insertFirst(val);
		
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}

    public Node deleteDuplicates(Node head) {

        if(head == null) return head;

       Node node = head; //current

        while(node.next != null){
            if(node.val == node.next.val){ //if curr.val == curr.next.val
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
                tail = node;
                tail.next = null;
            }
        }

        return head;
    }
	
	private class Node{
		
		private int val;
		private Node next;
		
		public Node(int value) {
			this.val = value;
		}
		
		public Node(int value, Node next) {
			this.val = value;
			this.next = next;
		}
	}
}

public class RemoveDupsOfSortedList {
	
	public static void main(String[] args) {

		LL list = new LL();
		list.insertLast(3);
		list.insertLast(4);
		list.insertLast(1);
		list.insertLast(8);
		
		
	}

}
