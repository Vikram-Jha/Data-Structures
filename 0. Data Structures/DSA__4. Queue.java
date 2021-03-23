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

//(A queue can be implemenated using array linklist and stack we need to know every implementation)


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

// Implementing  queue using stacks

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



