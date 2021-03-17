package com.company;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {            //Node class is an implementation detail hence set to private
        private int value;
        private Node next;

        private Node(int value){
            this.value= value;
        }
    }

    private Node first;
    private Node last;
    private int size;               //Handling the size here is more efficient O(1) then traversing the list to calculate the size O(n)

    public void addLast(int item){
        var node = new Node(item);   //Node class is a subclass hence LinkedList is able to access its private member

        if(isEmpty())               //Repeating logic must be created as function so it can be called over and over again
            first=last=node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);

        if(isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item){
        int index=0;
        Node current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
//        Node current = first;
//        while(current != null){
//            if(current.value == item) return true;
//            current = current.next;
//        }
//        return false;                                 //If there exist a code in our project with exact logic we have to use it again
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }

        else {
            var second = first.next;
            first.next = null;                              //Its important to dereference it else java garbage collector will not remove this object from heap
            first = second;
        }
        size--;
    }

    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();

        if(first == last) {
            first = last = null;
        }

        else {
            var secondLast = getPrevious(last);

            last = secondLast;
            last.next = null;
        }
        size--;
    }

    public int[] toArray(){
        int [] array = new int[size];
        var current = first;
        var index= 0;

        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

//    public int size(){
//        int size = 0;
//        var current = first;
//        while (current != null) {
//            current = current.next;
//            size++;
//        }
//        return size;
//    }

    public int getSize() {
        return size;
    }

    public void print(){
      Node current = first;
        while (current!=null){
            System.out.print(current.value+ " ");
            current = current.next;
        }
        System.out.println();
    }

    private Node getPrevious(Node test){
        var current = first;
        while (current!=null){
            if(current.next == test) return current;
            current = current.next;
        }
    return null;
    }

    private boolean isEmpty(){
        if(first==null)
            return true;
        return false;
    }
}


//Main Class

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(30);
        list.addLast(20);
        list.addLast(10);
        list.addFirst(50);
        list.addLast(70);
        list.print();
        System.out.println(list.indexOf(70));
        System.out.println(list.contains(50));
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
        int a = list.getSize();
        System.out.println(a);
        System.out.println(Arrays.toString(list.toArray()));
    }
}


OUTPUT :-
50 30 20 10 70 
4
true
30 20 10 70 
30 20 10 
3
[30, 20, 10]
