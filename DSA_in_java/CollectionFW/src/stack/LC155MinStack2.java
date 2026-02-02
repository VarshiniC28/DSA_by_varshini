package stack;

import java.util.Stack;

//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//
//Implement the MinStack class:
//
//MinStack() initializes the stack object.
//void push(int val) pushes the element val onto the stack.
//void pop() removes the element on the top of the stack.
//int top() gets the top element of the stack.
//int getMin() retrieves the minimum element in the stack.
//You must implement a solution with O(1) time complexity for each function.

public class LC155MinStack2 {
	
	Stack<Integer> s; //[oldMin, newMIn ...]
    int min;

    public LC155MinStack2() {
        s = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val <= min) {
            s.push(min); //first store prev min in stack
            min = val;
        }
        s.push(val); //now store the val - could be new min
    }

    public void pop() {
        if (s.pop() == min) { //if the the popped element is min then update min to old min thats just below it
            min = s.pop();
        }
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
    }

    
    
	public static void main(String[] args) {

		LC155MinStack2 minStack = new LC155MinStack2();
		minStack.push(1);
	}

}
