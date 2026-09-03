package LinkedList.LengthOfLoop;

import java.util.*;

// Node class represents a node in a linked list
class Node {
    // Data stored in the node
    int data;

    // Pointer to the next node
    Node next;

    // Constructor with both data and next node
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data
    Node(int data1) {
        data = data1;
        next = null;
    }
}


public class BruteForce {

    // Function to return the length of loop using hashing
    public static int lengthOfLoop(Node head) {
        // Hashmap to store visited nodes and their timer values
        HashMap<Node, Integer> visitedNodes = new HashMap<>();

        // Pointer to traverse the linked list
        Node temp = head;

        // Timer to track visited nodes
        int timer = 0;

        // Traverse the linked list till temp reaches null
        while (temp != null) {
            // If revisiting a node, return the difference of timer values
            if (visitedNodes.containsKey(temp)) {
                // Calculate the length of the loop
                int loopLength = timer - visitedNodes.get(temp);

                // Return the length of the loop
                return loopLength;
            }

            // Store the current node and its timer value
            visitedNodes.put(temp, timer);

            // Move to the next node
            temp = temp.next;

            // Increment the timer
            timer++;
        }

        // If traversal is completed, we reach the end of the list
        // means there is no loop
        return 0;
    }

    public static void main(String[] args) {
        // Creating a sample linked list with a loop
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating a loop from fifth to second
        fifth.next = second;

        // Getting the loop length
        int loopLength = lengthOfLoop(head);

        // Printing the result
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
//time complexity = O(N)
//space complexity = O(N)