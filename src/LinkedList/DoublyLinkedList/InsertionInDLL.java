package LinkedList.DoublyLinkedList;

class Solution {

    // Function to convert an array to a doubly linked list
    public static Node convertArr2DLL(int[] arr) {
        // Create the head node with the first element of the array
        Node head = new Node(arr[0]);
        Node prev = head;  // Initialize 'prev' to the head node

        // Traverse the array to create the doubly linked list
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i] ,prev, null);  // Create a new node
            prev.next = temp;  // Set 'next' of the previous node to the new node
            prev = temp;  // Move 'prev' to the new node
        }

        return head;  // Return the head of the doubly linked list
    }

    // Function to print the elements of the doubly linked list
    public static void print(Node head) {
        // Traverse through the list and print each node's data
        while (head != null) {
            System.out.print(head.data + " ");  // Print the data of the current node
            head = head.next;  // Move to the next node
        }
        System.out.println();  // New line after printing the list
    }

    // Function to insert a new node at the tail of the doubly linked list
    public static Node insertAtTail(Node head, int k) {
        // Create a new node with data 'k'
        Node newNode = new Node(k);

        // If the list is empty, return the new node as the head
        if (head == null) {
            return newNode;
        }

        // Traverse to the last node of the doubly linked list
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Connect the new node to the last node
        tail.next = newNode;
        newNode.prev = tail;  // Set the 'back' pointer of the new node to the previous node
        return head;  // Return the head of the modified list
    }
}


public class InsertionInDLL {

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = {12, 5, 8, 7, 4};

        // Convert the array to a doubly linked list
        Node head = Solution.convertArr2DLL(arr);

        // Print the initially created doubly linked list
        System.out.println("Doubly Linked List Initially: ");
        Solution.print(head);

        // Insert a node with value 10 at the end of the doubly linked list
        System.out.println("\nDoubly Linked List After Inserting at the tail with value 10: ");
        head = Solution.insertAtTail(head, 10);
        Solution.print(head);
    }
}
