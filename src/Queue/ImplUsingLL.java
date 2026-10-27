package Queue;

class Node{
   int val;
   Node next;

   Node(int val){
       this.val = val;
       this.next = null;
   }

}

class Queue{

    Node front = null;
    Node rear = null;
    int length;


    void enqueue(int val) {
        Node newNode = new Node(val);

        if (front == null) {          // queue khali thi
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;      // purane rear ke baad jodo
            rear = newNode;           // ab naya node rear hai
        }
        length++;
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.val;
        front = front.next;
        if (front == null) {          // queue khali ho gayi to rear bhi null karo
            rear = null;
        }
        length--;
        return value;
    }

    int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.val;
    }

    boolean isEmpty() {
        return front == null;
    }

    int size() {
        return length;
    }

    void display() {
        Node cur = front;             // front ko mat badlo, copy pe chalo
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}

public class ImplUsingLL {

    public static void main(String[] args){

        Queue Q = new Queue();

        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);
       System.out.println(Q.dequeue()); // 1
        System.out.println(Q.size());  //2
       Q.display(); // 2  3
        Q.enqueue(4); // 2 3 4
        Q.dequeue(); // 2
        Q.display(); // 3 4
    }
}

// time complexity = O(1)
// space complexity = O(N)
