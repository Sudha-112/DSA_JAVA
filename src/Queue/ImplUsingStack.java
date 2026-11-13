package Queue;

import java.util.Stack;

class QueueUsingStack {

    private Stack<Integer> input;   // new elements are pushed here
    private Stack<Integer> output;  // elements are popped from here

    public QueueUsingStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    // O(1)
    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        shiftIfNeeded();
        return output.pop();
    }

    public int peek() {
        shiftIfNeeded();
        return output.peek();
    }

    // O(1)
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    // Move elements only when output is empty
    private void shiftIfNeeded() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }
}

public class ImplUsingStack {

    public static void main(String [] args){
        QueueUsingStack q = new QueueUsingStack();

        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.peek());  // 1
        System.out.println(q.pop());   // 1
        q.push(4);
        System.out.println(q.pop());   // 2
        System.out.println(q.pop());   // 3
        System.out.println(q.pop());   // 4
        System.out.println(q.empty()); // true

    }
}
