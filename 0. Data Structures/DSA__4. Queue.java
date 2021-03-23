//Reversing a queue using stack

 public static void reverse(Queue<Integer> queue){
        // [10, 20, 30]
        // [30, 20, 10]
   
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }

//Normal Queue implementation using array

package com.company;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int front;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException("Queue is full");

        items[rear++] = item;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        var item = items[front];
        items[front++] = 0;

        return item;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");

        return items[front];
    }

    public boolean isEmpty() {
        return front== rear;
    }

    public boolean isFull() {
        return rear == items.length;
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(items);
    }
}

//Circular queue implementation using arrays


