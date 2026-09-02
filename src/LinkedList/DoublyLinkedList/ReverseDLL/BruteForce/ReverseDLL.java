package LinkedList.DoublyLinkedList.ReverseDLL.BruteForce;

import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    // Constructor with data, next, and back
    Node(int data1, Node prev1, Node next1) {
        data = data1;
        prev = prev1;
    }

    // Constructor with only data
    Node(int data1) {
        data = data1;
        prev = null;
        next = null;
    }
}

// Solution class with DLL methods
class Solution {

    // Function to convert array to doubly linked list
    public Node convertArr2DLL(int[] arr) {
        // Create the head node
        Node head = new Node(arr[0]);

        // Initialize previous pointer
        Node prev = head;

        // Traverse remaining array elements
        for (int i = 1; i < arr.length; i++) {
            // Create a new node and link back to previous
            Node temp = new Node(arr[i], prev, null);
            prev.next = temp;
            prev = temp;
        }

        // Return the head of DLL
        return head;
    }

    // Function to print the doubly linked list
    public void print(Node head) {
        // Traverse the list and print data
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Function to reverse the DLL using stack
    public Node reverseDLL(Node head) {
        // If list is empty or has one element, return it
        if (head == null || head.next == null) {
            return head;
        }

        // Stack to store node values
        Stack<Integer> st = new Stack<>();

        // Pointer to traverse list
        Node temp = head;

        // Push all node data to stack
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }

        // Reset temp to head
        temp = head;

        // Replace node values from stack
        while (temp != null) {
            temp.data = st.pop();
            temp = temp.next;
        }

        // Return updated head
        return head;
    }
}

public class ReverseDLL {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Input array
        int[] arr = {12, 5, 8, 7, 4};

        // Convert to DLL
        Node head = sol.convertArr2DLL(arr);

        System.out.println("Doubly Linked List Initially:");
        sol.print(head);

        // Reverse DLL
        head = sol.reverseDLL(head);

        System.out.println("\nDoubly Linked List After Reversing:");
        sol.print(head);
    }

}

//time complexity = O(2N)
//space complexity = =O(N)