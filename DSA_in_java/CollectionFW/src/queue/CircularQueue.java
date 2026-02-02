package queue;

import java.util.Arrays;

public class CircularQueue {

    // -------------------- DATA --------------------
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int front = 0; // points to first element
    private int end = 0;   // points to next insertion position
    private int size = 0;  // current number of elements

    // -------------------- CONSTRUCTORS --------------------

    public CircularQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CircularQueue(int capacity) {
        this.data = new int[capacity];
    }

    // -------------------- CORE OPERATIONS --------------------

    // add() - insert element at end
    public void add(int item) {

        if (size == data.length) {
            resize(); // grow when full
        }

        data[end] = item;
        end = (end + 1) % data.length; // circular move
        size++;
    }

    // poll() - remove and return front element
    public int poll() {

        if (isEmpty())
            throw new QueueException("Cannot poll from empty queue");

        int removed = data[front];
        data[front] = 0; // clearing slot (important for objects)

        front = (front + 1) % data.length; // circular move
        size--;

        return removed;
    }

    // peek() - view front element
    public int peek() {

        if (isEmpty())
            throw new QueueException("Cannot peek into empty queue");

        return data[front];
    }

    // -------------------- HELPER METHODS --------------------

    private void resize() {
        int[] newArr = new int[data.length * 2];

        // copy elements in correct order
        for (int i = 0; i < size; i++) {
            newArr[i] = data[(front + i) % data.length];
        }

        data = newArr;
        front = 0;
        end = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
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
        int[] logicalQueue = new int[size];

        for (int i = 0; i < size; i++) {
            logicalQueue[i] = data[(front + i) % data.length];
        }

        return Arrays.toString(logicalQueue);
    }

    // -------------------- TESTING --------------------

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);

        q.poll();
        q.poll();

        System.out.println(q);

        q.add(60);
        q.add(70);
        q.add(80); // resize happens here

        System.out.println(q);
        System.out.println(q.peek());
    }
}
