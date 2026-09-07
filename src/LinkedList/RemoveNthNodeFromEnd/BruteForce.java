package LinkedList.RemoveNthNodeFromEnd;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class BruteForce {
    public static Node removeNthFromEnd(Node head, int n) {
        // Dummy node to handle edge case of removing head
        Node dummy = new Node(0);
        dummy.next = head;

        // Step 1: Find length of the list
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;

        }

        // Step 2: Find position from start (0-indexed from dummy)
        // Node to remove is at position (length - n) from head
        int stepsFromDummy = length - n;

        // Step 3: Traverse to the node just before the one to remove
        Node prev = dummy;
        for (int i = 0; i < stepsFromDummy; i++) {
            prev = prev.next;
        }

        // Step 4: Remove the node
        prev.next = prev.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        // List: 1 -> 2 -> 3 -> 4 -> 5, remove 2nd node from end
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node newHead = removeNthFromEnd(head, 2);

        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}

//two passes solution
//time complexity = O(N)
//space complexity = O(1)