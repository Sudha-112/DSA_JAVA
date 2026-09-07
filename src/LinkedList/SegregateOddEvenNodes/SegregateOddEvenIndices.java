package LinkedList.SegregateOddEvenNodes;

public class SegregateOddEvenIndices {

    public static Node oddEvenList(Node head) {
        // Edge case: empty or single node list
        if (head == null || head.next == null) return head;

        Node odd = head;           // pointer for odd-indexed nodes
        Node even = head.next;     // pointer for even-indexed nodes
        Node evenHead = even;      // save start of even list to attach later

        while (even != null && even.next != null) {
            odd.next = even.next;   // odd jumps to next odd node
            odd = odd.next;

            even.next = odd.next;   // even jumps to next even node
            even = even.next;
        }

        // Attach even list at the end of odd list
        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) {

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node newHead = oddEvenList(head);

        while (newHead != null) {
            System.out.print(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}

//time complexity = O(N)
//space complexity = O(1)
