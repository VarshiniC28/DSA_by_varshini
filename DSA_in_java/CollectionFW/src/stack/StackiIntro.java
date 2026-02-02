package stack;

import java.util.Stack;

public class StackiIntro {

	public static void main(String[] args) {

		// Stack is DS that follows FILO / LIFO structure
		
		//inbuilt way to build stack
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.peek()); //last element will be on top so we get last element 
		
		//pop method in stack removes the element and returns the int element
		System.out.println(stack.pop()); //5 LIFO
		System.out.println(stack.pop());
	}

}
