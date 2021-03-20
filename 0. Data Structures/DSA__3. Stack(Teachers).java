//Stack Implemetations

package com.codewithmosh;

import java.util.Arrays;

public class Stack {
  private int[] items = new int[5];
  private int count;

  public void push(int item) {
    if (count == items.length)
      throw new StackOverflowError();

    items[count++] = item;
  }

  public int pop() {
    if (count == 0)
      throw new IllegalStateException();

    return items[--count];
  }

  public int peek() {
    if (count == 0)
      throw new IllegalStateException();

    return items[count - 1];
  }

  public boolean isEmpty() {
    return count == 0;
  }

  @Override
  public String toString() {
    var content = Arrays.copyOfRange(items, 0, count);
    return Arrays.toString(content);
  }
}


//String Reverser
package com.codewithmosh;

import java.util.Stack;

public class StringReverser {
  public String reverse(String input) {
    if (input == null)
      throw new IllegalArgumentException();

    Stack<Character> stack = new Stack<>();

    for (char ch : input.toCharArray())
      stack.push(ch);

    StringBuffer reversed = new StringBuffer();
    while (!stack.empty())
      reversed.append(stack.pop());

    return reversed.toString();
  }
}


//Balanced Expression
package com.codewithmosh;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

  private final List<Character> leftBrackets
          = Arrays.asList('(', '<', '[', '{');
  private final List<Character> rightBrackets
          = Arrays.asList(')', '>', ']', '}');

  public boolean isBalanced(String input) {
    Stack<Character> stack = new Stack<>();

    for (char ch : input.toCharArray()) {
      if (isLeftBracket(ch))
        stack.push(ch);

      if (isRightBracket(ch)) {
        if (stack.empty()) return false;

        var top = stack.pop();
        if (!bracketsMatch(top, ch)) return false;
      }
    }

    return stack.empty();
  }

  private boolean isLeftBracket(char ch) {
    return leftBrackets.contains(ch);
  }

  private boolean isRightBracket(char ch) {
    return rightBrackets.contains(ch);
  }

  private boolean bracketsMatch(char left, char right) {
    return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
  }
}
