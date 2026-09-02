package LinkedList.DoublyLinkedList;

class Solution1 {

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

    //Function to delete the last node
    public static Node DeleteTail(Node head) {


        // If the list is empty, return the new node as the head
        if (head == null || head.next == null) {
            return null;
        }

        // Traverse to the last node of the doubly linked list
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.prev.next = null;
        return head;  // Return the head of the modified list
    }
}


public class DeletionInDLL {

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = {12, 5, 8, 7, 4};

        // Convert the array to a doubly linked list
        Node head = Solution1.convertArr2DLL(arr);

        // Print the initially created doubly linked list
        System.out.println("Doubly Linked List Initially: ");
        Solution1.print(head);

        // Insert a node with value 10 at the end of the doubly linked list
        System.out.println("\nDoubly Linked List After Deleting the tail with value 10: ");
        head = Solution1.DeleteTail(head);
        Solution1.print(head);
    }
}


