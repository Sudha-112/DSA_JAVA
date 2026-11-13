package Stack;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue{

    Queue<Integer> q = new LinkedList<>();

    public void push(int x){       //O(N)
        q.add(x);
        for(int i = 0; i < q.size()-1; i++){
            q.add(q.remove());
        }
    }

    public int pop(){   //O(1)
        if(q.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return q.remove();
    }

    public int top(){
        if(q.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        return q.peek();
    }

    boolean isEmpty(){
        return q.isEmpty();
    }

    public int size(){
        return q.size();
    }

}

public class ImplUsingQueue {

    public static void main(String [] args){
        StackUsingQueue st = new StackUsingQueue();

        st.push(4);
        st.push(9);
        st.push(5);
        System.out.println("Pop : " + st.pop());
        System.out.println("Size : " + st.size());
        System.out.println("Top : " + st.top());

    }
}

