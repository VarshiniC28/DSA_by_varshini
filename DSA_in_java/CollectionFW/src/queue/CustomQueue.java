package queue;

import java.util.Arrays;

public class CustomQueue {

    // -------------------- DATA --------------------
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = -1;
    // end points to last inserted element

    // -------------------- CONSTRUCTORS --------------------

    public CustomQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    // -------------------- CORE OPERATIONS --------------------

    // add() - insert element at end
    public void add(int item) {

        if (end == data.length - 1) {
            resize(); 
            // increase capacity when full
        }

        data[++end] = item;
    }

    // poll() - remove and return front element
    public int poll() {

        if (isEmpty())
            throw new QueueException("Cannot poll from empty queue");

        int removed = data[0];

        // shift elements left to maintain FIFO order //O(n)
        for (int i = 1; i <= end; i++) {
            data[i - 1] = data[i];
        }

        data[end] = 0; 
        // clearing slot (important for objects)

        end--;
        return removed;
    }

    // peek() - view front element without removing
    public int peek() {

        if (isEmpty())
            throw new QueueException("Cannot peek into empty queue");

        return data[0];
    }

    // -------------------- HELPER METHODS --------------------

    private void resize() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public int size() {
        return end + 1;
    }

    // -------------------- CUSTOM EXCEPTION --------------------

    static class QueueException extends RuntimeException {
        public QueueException(String message) {
            super(message);
        }
    }

    // -------------------- UTILITY --------------------

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(data, 0, end + 1));
    }

    // -------------------- TESTING --------------------

    public static void main(String[] args) {

        CustomQueue queue = new CustomQueue(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60); // resize happens

        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue);

        queue.add(70);

        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
