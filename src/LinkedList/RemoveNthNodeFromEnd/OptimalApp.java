package LinkedList.RemoveNthNodeFromEnd;

public class OptimalApp {

    public static Node removeNthFromEnd(Node head, int n) {
        // Dummy node handles edge case: removing the head node
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy, slow = dummy;

        // Move fast n+1 steps ahead, so gap between fast and slow is n
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // slow is now right before the node to remove
        slow.next = slow.next.next;

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

//one pass solution (two pointer method)
//time complexity = O(N)
//space complexity = O(1)