package Queue;

import java.util.Stack;

class QueueUsingStack {

    private Stack<Integer> s1;   // new elements are pushed here
    private Stack<Integer> s2;  // elements are popped from here

    public QueueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }

        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
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
