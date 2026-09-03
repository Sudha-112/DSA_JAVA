package LinkedList.isLLPalindrome;

import java.util.Stack;

// Node class represents a node in a linked list
class Node {
    int data;
    Node next;

    // Constructor with both data and next node as parameters
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data as a parameter, sets next to null
    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class bruteForce {

    // Function to check if the linked list is a palindrome
    public static boolean isPalindrome(Node head) {

        // Create an empty stack to store values
        Stack<Integer> st = new Stack<>();

        // Initialize a temporary pointer to the head of the linked list
        Node temp = head;

        // Traverse the linked list and push values onto the stack
        while (temp != null) {

            // Push the data from the current node onto the stack
            st.push(temp.data);

            // Move to the next node
            temp = temp.next;
        }

        // Reset the temporary pointer back to the head of the linked list
        temp = head;

        // Compare values by popping from the stack and checking against linked list nodes
        while (temp != null) {

            // If values don't match, it's not a palindrome
            if (temp.data != st.peek()) {
                return false;
            }

            // Pop the value from the stack
            st.pop();

            // Move to the next node in the linked list
            temp = temp.next;
        }

        // If all values match, it's a palindrome
        return true;
    }


    // Function to print the linked list
    public static void printLinkedList(Node head) {

        Node temp = head;

        while (temp != null) {

            // Print the current node's data
            System.out.print(temp.data + " ");

            // Move to the next node
            temp = temp.next;
        }

        System.out.println();
    }




    public static void main(String[] args) {

        // Create a linked list with values 1, 5, 2, 5, and 1 (15251, a palindrome)
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(2);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(1);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Check if the linked list is a palindrome
        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}


//time complexity = O(N)
//space complexity = O(N)