package LinkedList.AddOneInLL;

// Node class representing a single digit in the linked list
class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class bruteForce {

    // Function to print the list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
    }

    // function to reverse the linked list
    public static Node reverseList(Node node) {
        Node prev = null;
        Node current = node;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Function to add one to the number represented by the linked list
    public static Node addOne(Node head) {
        // Reverse the list to make least significant digit accessible
        head = reverseList(head);

        Node current = head;
        int carry = 1;

        // Traverse the list and add carry
        while (current != null && carry > 0) {
            int sum = current.data + carry;
            current.data = sum % 10;
            carry = sum / 10;

            // If there's no next node and we still have a carry, append a new node
            if (current.next == null && carry > 0) {
                current.next = new Node(carry);
                carry = 0;
            }

            current = current.next;
        }

        // Reverse the list back to restore original order
        head = reverseList(head);
        return head;
    }

    public static void main(String[] args) {


        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);

        printList(head);

        Node newHead = addOne(head);
        printList(newHead);
}
}


// two reverses and one add pass
//time complexity = O(N)
//space complexity = O(1)
