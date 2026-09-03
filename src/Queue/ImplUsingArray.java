package Queue;

import java.util.*;

class ArrayQueue {

    private int[] queue;
    private int capacity;
    private int front;
    private int rear;
    private int size;

    // Constructor
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue - element add karna
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;

        System.out.println(value + " inserted");
    }

    // Dequeue - element remove karna
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % capacity;
        size--;

        return value;
    }

    // Peek - front element dekhna
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check full
    public boolean isFull() {
        return size == capacity;
    }

    // Display queue
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }

        System.out.println();
    }
}

public class ImplUsingArray {

    public static void main(String[] args) {

        ArrayQueue q = new ArrayQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        System.out.println("Front element: " + q.peek()); //10

        System.out.println("Removed: " + q.dequeue()); //10
        System.out.println("Removed: " + q.dequeue());  //20

        q.display();

        q.enqueue(50);
        q.enqueue(60);

        q.display();

        System.out.println("Is Queue Empty? " + q.isEmpty());//false
        System.out.println("Is Queue Full? " + q.isFull()); //false
    }
}
//time complexity = O(1)
//space complexity = O(N)