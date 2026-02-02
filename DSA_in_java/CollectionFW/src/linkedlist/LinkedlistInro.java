package linkedlist;

import java.util.LinkedList;

//A linked list is a linear data structure where elements (nodes) aren't stored in contiguous memory, 
//but are linked by pointers, forming a chain; each node holds data and a reference to the next node, 
//allowing dynamic size and efficient insertions/deletions, unlike arrays.
//The list starts with a head node, and the last node points to NULL, signifying the end. 

//1. Single Linked List
//2. DLL
//3. CLL

public class LinkedlistInro {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(8);
		list.add(9);
		
		System.out.println(list); //[3, 4, 1, 8, 9]
	}
	
}
