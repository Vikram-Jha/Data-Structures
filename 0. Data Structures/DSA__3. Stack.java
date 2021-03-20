package com.company;

import java.util.Arrays;

public class Stack {
    private int [] arr;
    private int count;

    public Stack (int size){
        if(size<0)
            throw new IllegalArgumentException();
        arr = new int[size];
    }

    public void push(int item){
        if(count==arr.length){
            int[] newItems = new int[count*2];
            for (int i = 0; i < count; i++) {
                newItems[i] = arr[i];
            }
            arr = newItems;
        }
        arr[count++] = item;
    }

    public int pop(){
        if(count==0)
            throw new IllegalStateException();

        return arr[--count];
    }

    public int peek(){
        if(count==0)
            throw new IllegalStateException();

        return arr[count-1];
    }



    public boolean balancedExpression(String str) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '<' || ch == '(' || ch == '[' || ch == '<')
                stack.push(ch);

            if (ch == '>' || ch == ')' || ch == ']' || ch == '>') {
                if(stack.isEmpty()) return false;

                if ((ch == ']' && stack.pop() != '[') ||
                    (ch == ')' && stack.pop() != '(') ||
                    (ch == '}' && stack.pop() != '[') ||
                    (ch == '>' && stack.pop() != '('))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(arr, 0, count);
        return Arrays.toString(content);
    }

    public boolean isEmpty(){
        return count==0;
    }
    public void print(){
        for(int i = 0;i<count;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}


//main method

package com.company;
public class Main {

    public static void main(String[] args) {
        var marks = new Stack(5);
        marks.push(10);
        marks.push(20);
        marks.push(30);
        marks.push(40);
        marks.push(50);
        marks.print();
        marks.pop();
        marks.print();
        System.out.println(marks.peek());
        marks.print();
        System.out.println(marks.toString());
        System.out.println(marks.isEmpty());
    }
}

40
10 20 30 40 
[10, 20, 30, 40]
false
