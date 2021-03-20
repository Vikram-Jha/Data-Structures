//Two stack implementation using one array

package com.codewithmosh;

import java.util.Arrays;

public class TwoStacks {
  private int top1;
  private int top2;
  private int[] items;

  public TwoStacks(int capacity) {
    if (capacity <= 0)
      throw new IllegalArgumentException("capacity must be 1 or greater.");

    items = new int[capacity];
    top1 = -1;
    top2 = capacity;
  }

  public void push1(int item) {
    if (isFull1())
      throw new IllegalStateException();

    items[++top1] = item;
  }

  public int pop1() {
    if (isEmpty1())
      throw new IllegalStateException();

    return items[top1--];
  }

  public boolean isEmpty1() {
    return top1 == -1;
  }

  public boolean isFull1() {
    return top1 + 1 == top2;
  }

  public void push2(int item) {
    if (isFull2())
      throw new IllegalStateException();

    items[--top2] = item;
  }

  public int pop2() {
    if (isEmpty2())
      throw new IllegalStateException();

    return items[top2++];
  }

  public boolean isEmpty2() {
    return top2 == items.length;
  }
  public boolean isFull2() {
    return top2 - 1 == top1;
  }

  @Override
  public String toString() {
    return Arrays.toString(items);
  }
}


//Minimum in each pop operation

package com.codewithmosh;

// We need two stacks to implement a min stack.
// One stack holds the values, the other stack
// (called minStack) holds the minimums.
public class MinStack {
  private Stack stack = new Stack();
  private Stack minStack = new Stack();

  public void push(int item) {
    stack.push(item);

    if (minStack.isEmpty())
      minStack.push(item);
    else if (item < minStack.peek())
      minStack.push(item);
  }

  public int pop() {
    if (stack.isEmpty())
      throw new IllegalStateException();

    var top = stack.pop();

    if (minStack.peek() == top)
      minStack.pop();

    return top;
  }

  public int min() {
    return minStack.peek();
  }
}
