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
