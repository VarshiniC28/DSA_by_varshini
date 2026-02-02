package queue;

import java.util.Arrays;
import java.util.Stack;

public class QueueUsingOnlyStack {
	
	private Stack<Integer> first;
	private Stack<Integer> sec;
	
	public QueueUsingOnlyStack() {
		this.first = new Stack<>();
		this.sec = new Stack<>();
	}
	
	public void add(int item) {
		first.push(item);
	}
	
	//remove
	public int poll() throws Exception {
		while(!first.isEmpty()) {
			sec.push(first.pop());
		}
		
		int removed = sec.pop(); //top element in sec stack will be our first left element in queue
		
		while(!sec.isEmpty()) {
			first.push(sec.pop());
		}
		
		return removed;
	}
	
	//peek
	public int peek() throws Exception {
		while(!first.isEmpty()) {
			sec.push(first.pop());
		}
		
		int peek = sec.peek(); //top element in sec stack will be our first left element in queue
		
		while(!sec.isEmpty()) {
			first.push(sec.pop());
		}
		
		return peek;
	}
	
	//empty or not method for queue 
	public boolean empty() {
		return first.isEmpty();
	}
	

	public static void main(String[] args) throws Exception {

		QueueUsingOnlyStack queue = new QueueUsingOnlyStack();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		
		System.out.println(queue.peek());
		
		
	}

}
