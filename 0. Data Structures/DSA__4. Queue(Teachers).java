//Queue using array

package com.codewithmosh;

import java.util.Arrays;

public class ArrayQueue {
  private int[] items;
  private int rear;
  private int front;
  private int count;

  public ArrayQueue(int capacity) {
    items = new int[capacity];
  }

  public void enqueue(int item) {
    if (isFull())
      throw new IllegalStateException();

    items[rear] = item;
    rear = (rear + 1) % items.length;
    count++;
  }

  public int dequeue() {
    if (isEmpty())
      throw new IllegalStateException();

    var item = items[front];
    items[front] = 0;
    front = (front + 1) % items.length;
    count--;

    return item;
  }

  public int peek() {
    if (isEmpty())
      throw new IllegalStateException();

    return items[front];
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public boolean isFull() {
    return count == items.length;
  }

  @Override
  public String toString() {
    return Arrays.toString(items);
  }
}

//Queue using stacks

package com.company;

import java.util.Stack;

public class QueueTwoStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item){
        stack1.push(item);
    }

    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.pop();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.peek();
    }


    private void moveStack1ToStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public String toString(){
        if(stack2.isEmpty())
            moveStack1ToStack2();

        return (stack2.toString());
    }
}

//Queue Reverser

public static void reverse(Queue<Integer> queue, int k) {
        if (k < 0 || k > queue.size())
            throw new IllegalArgumentException();

        java.util.Stack<Integer> stack = new Stack<>();

        // Dequeue the first K elements from the queue
        // and push them onto the stack
        for (int i = 0; i < k; i++)
            stack.push(queue.remove());

        // Enqueue the content of the stack at the
        // back of the queue
        while (!stack.empty())
            queue.add(stack.pop());

        // Add the remaining items in the queue (items
        // after the first K elements) to the back of the
        // queue and remove them from the beginning of the queue
        for (int i = 0; i < queue.size() - k; i++)
            queue.add(queue.remove());

    }

//Queue using Linkedlist in java

package com.codewithmosh;

import java.util.ArrayList;

public class LinkedListQueue {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    // O(1)
    public void enqueue(int item) {
        var node = new Node(item);

        if (isEmpty())
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }

        count++;
    }

    // O(1)
    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        int value;
        if (head == tail) {
            value = head.value;
            head = tail = null;
        }
        else {
            value = head.value;
            var second = head.next;
            head.next = null;
            head = second;
        }

        count--;

        return value;
    }

    // O(1)
    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return head.value;
    }

    // O(1)
    public int size() {
        return count;
    }

    // O(1)
    public boolean isEmpty() {
        return head == null;
    }

    // O(n)
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();

        Node current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }

        return list.toString();
    }
}

//Stack with two queue

package com.codewithmosh;

import java.util.ArrayDeque;
import java.util.Queue;

// We always use queue1 for pushing new items.
// When popping an item, we move all the items
// except the last one from queue1 to queue2.
//
// Q1 [10, 20, 30, 40] => Q1 [40]
// Q2 []               => Q2 [10, 20, 30]
//
// Now the item to be popped is in Q1. We remove
// and return that as the item on top of the stack.
//
// Q1 []
// Q2 [10, 20, 30]
//
// We should swap the queues, so we can repeat this
// algorithm next time we need to pop the stack.
//
// Q1 [10, 20, 30]
// Q2 []  (ready for moving items)

public class StackWithTwoQueues {
    private Queue<Integer> queue1 = new ArrayDeque<>();
    private Queue<Integer> queue2 = new ArrayDeque<>();
    private int top;

    // O(1)
    public void push(int item) {
        queue1.add(item);
        top = item;
    }

    // O(n)
    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        while (queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }

        swapQueues();

        return queue2.remove();
    }

    private void swapQueues() {
        var temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // O(1)
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    // O(1)
    public int size() {
        return queue1.size();
    }

    // O(1)
    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return top;
    }

    @Override
    public String toString() {
        return queue1.toString();
    }
}
