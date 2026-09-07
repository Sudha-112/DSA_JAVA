package LinkedList.DeleteMiddleNode;

public class optimalApp {

    public static Node deleteMiddle(Node head) {
        // Edge case: single node -> list empty ho jaayegi
        if (head == null || head.next == null) return null;


        Node slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow ab middle node hai, use unlink karo
        prev.next = slow.next;

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

//two pointer method( one pass )
//time complexity = O(N)
//space complexity = O(1)
