package stack;

import java.util.Arrays;

public class CustomStack {

    protected int[] data; // kept protected as in your version (even though private is better)
    
    // -------------------- CONSTANTS --------------------
    private static final int DEFAULT_SIZE = 10;

    // -------------------- STATE --------------------
    int top = -1; // index starts at -1 because stack is empty

    // -------------------- CONSTRUCTORS --------------------

    // when size not given use default size
    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    // when size is given
    public CustomStack(int size) {
        this.data = new int[size];
    }

    // -------------------- CORE OPERATIONS --------------------

    // insert - push()
    public boolean push(int item) {

        // FIX: check capacity BEFORE incrementing top
        if (top == data.length - 1) { // stack is full
            resize(); // FIX: resize array instead of failing
            // small note: now stack never "fails", it grows
        }

        top++;
        data[top] = item;
        return true;
    }

    // delete - pop()
    public int pop() {
        if (isEmpty())
            throw new StackException("Cannot pop empty stack");

        int removed = data[top];
        data[top] = 0;   // FIX: clear value (important habit for objects)
        top--;
        return removed;
    }

    // peek() - see element at top without removing
    public int peek() {
        if (isEmpty())
            throw new StackException("Cannot peek into empty stack");

        return data[top];
    }

    // -------------------- HELPER METHODS --------------------

    // FIX: this method now ONLY resizes (name kept as you wrote it)
    private void resize() {
        data = Arrays.copyOf(data, data.length * 2); 
        // doubles stack capacity when full
    }

    private boolean isEmpty() {
        return top == -1;
    }

    // -------------------- CUSTOM EXCEPTION --------------------

    class StackException extends RuntimeException {
        public StackException(String message) {
            super(message);
        }
    }

    // -------------------- TESTING --------------------

    public static void main(String[] args) {

        CustomStack stack = new CustomStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // FIXED: no failure, array resizes automatically

        System.out.println(Arrays.toString(stack.data));

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(Arrays.toString(stack.data));

        stack.push(6);

        System.out.println(Arrays.toString(stack.data));
        
        //to check exception 
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
