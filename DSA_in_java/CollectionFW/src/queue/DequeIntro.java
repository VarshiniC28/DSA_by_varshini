package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeIntro {

	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.add(5); //this adds element at last and return boolean if added
		deque.addFirst(3); //adds at first
		deque.addLast(6); //adds at last
		
		deque.remove(3); //removes first occurence 3 as there are 2 3's
		deque.remove(3);//removes 3
		deque.remove(); //removes first element
		deque.removeLast(); //removes last element
		deque.removeFirst(); //removes first element
//		
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		
		System.out.println(deque);
	}

}
