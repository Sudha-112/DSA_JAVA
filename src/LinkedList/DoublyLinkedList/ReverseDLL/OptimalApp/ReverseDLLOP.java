package LinkedList.DoublyLinkedList.ReverseDLL.OptimalApp;

class Node {
    int data;
    Node next;
    Node prev;

    // Constructor with data, next, and back
    Node(int data1, Node prev1, Node next1) {
        data = data1;
        prev = prev1;
        next = next1;
    }

    // Constructor with only data
    Node(int data1) {
        data = data1;
        prev = null;
        next = null;
    }
}

// Solution class that contains core logic
class Solution {

    // Function to convert an array into a doubly linked list
    public Node convertArr2DLL(int[] arr) {

        // Creating the head of the DLL using the first array element
        Node head = new Node(arr[0]);

        // Initializing previous pointer to head
        Node prev = head;

        // Loop through rest of the array to construct DLL
        for (int i = 1; i < arr.length; i++) {

            // Create new node with current value, null next, and prev back pointer
            Node temp = new Node(arr[i], prev, null);

            // Connect previous node's next to this new node
            prev.next = temp;

            // Move prev to this new node
            prev = temp;
        }

        // Return the head of the constructed DLL
        return head;
    }

    // Function to reverse the doubly linked list
    public Node reverseDLL(Node head) {

        // Pointer to traverse the list
        Node current = head;

        // Variable to eventually store new head after reversal
        Node last = null;

        // Traverse the entire list
        while (current != null) {

            last = current.prev;
            current.prev = current.next;
            current.next = last;
            current = current.prev;
        }

        // Return the new head (was the last node in original list)
        return last.prev;
    }

    // Function to print the DLL from head to end
    public void printDLL(Node head) {

        // Traverse till end
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }
}

public class ReverseDLLOP {
    public static void main(String[] args) {

        // Create an instance of Solution class
        Solution sol = new Solution();

        // Sample array input
        int[] arr = {1, 2, 3, 4, 5};

        // Convert array to DLL
        Node head = sol.convertArr2DLL(arr);

        // Print the original DLL
        System.out.print("Original DLL: ");
        sol.printDLL(head);

        // Reverse the DLL
        Node reversed = sol.reverseDLL(head);

        // Print the reversed DLL
        System.out.print("Reversed DLL: ");
        sol.printDLL(reversed);

    }
}

//time complexity = O(N)
//space complexity = O(1)