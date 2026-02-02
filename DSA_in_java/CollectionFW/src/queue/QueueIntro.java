package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIntro {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println(queue.poll());//removes the first left element element and returns it
		System.out.println(queue); 
		
//		System.out.println(queue.peek());//gives first left element.
//		System.out.println(queue);
//		
//		//can also use remove method
//		System.out.println(queue.remove());
		
	}

}
