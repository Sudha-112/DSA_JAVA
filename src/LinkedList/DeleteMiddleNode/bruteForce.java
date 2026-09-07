package LinkedList.DeleteMiddleNode;

class Node{

    int data;
    Node next;

    Node(int data1){
        data = data1;
        next = null;
    }

    Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
}

public class bruteForce {
    public static Node deleteMiddle(Node head) {
        // Edge case: single node -> list empty ho jaayegi
        if (head == null || head.next == null) return null;

        // Step 1: Length nikalo
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Middle position calculate karo (0-indexed)
        int middleIndex = length / 2;

        // Step 3: Traverse to node just before middle
        Node prev = head;
        for (int i = 0; i < middleIndex - 1; i++) {
            prev = prev.next;
        }

        // Step 4: Middle node ko unlink karo
        prev.next = prev.next.next;

        return head;
    }

    public static void main(String[] args) {

        // List: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node newHead = deleteMiddle(head);

        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}

//bruteForce ( two passes )
//time complexity = O(N)
//space complexity = O(1)