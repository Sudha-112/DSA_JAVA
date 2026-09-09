package LinkedList.SortLL;
import java.util.*;

class Node {
    // Data stored in the node
    int data;

    // Pointer to the next node
    Node next;

    // Constructor with data and next pointer
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

public class bruteForce {

    // Function to sort the linked list
    public static Node sortLL(Node head) {
        // List to store node values
        ArrayList<Integer> arr = new ArrayList<>();

        // Pointer to traverse the list
        Node temp = head;

        // Traverse and push values into list
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }

        // Sort the list
        Collections.sort(arr);

        // Reassign sorted values to list nodes
        temp = head;
        for (int i = 0; i < arr.size(); i++) {
            temp.data = arr.get(i);
            temp = temp.next;
        }

        // Return head of sorted list
        return head;
    }

    // Function to print linked list
    public static void printLinkedList(Node head) {
        // Pointer to traverse list
        Node temp = head;

        // Traverse and print values
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // Create linked list: 3 -> 2 -> 5 -> 4 -> 1
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(5);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(1);

        // Print original list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Sort the linked list
        head = sortLL(head);

        // Print sorted list
        System.out.print("Sorted Linked List: ");
        printLinkedList(head);


    }
}

//time complexity = O(2*n + nLogn)
//space complexity = O(n)


