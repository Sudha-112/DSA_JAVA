package LinkedList.SortLL012;

public class optimalApp {

    public static Node sortList(Node head) {
        if (head == null || head.next == null) return head;

        // Dummy nodes for 0s, 1s, 2s
        Node zeroD = new Node(0), oneD = new Node(0), twoD = new Node(0);
        Node zero = zeroD, one = oneD, two = twoD;

        Node current = head;
        while (current != null) {
            if (current.data == 0) {
                zero.next = current;
                zero = zero.next;
            } else if (current.data == 1) {
                one.next = current;
                one = one.next;
            } else {
                two.next = current;
                two = two.next;
            }
            current = current.next;
        }

        // Connect: zero -> one -> two
        zero.next = (oneD.next != null) ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null; // avoid cycle

        Node newHead = zeroD.next;

        return newHead;
    }

    // Helper to print list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // List: 1 -> 2 -> 0 -> 1 -> 0 -> 2
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(2);

        Node newHead = sortList(head);
        printList(newHead);
    }
}

//time complexity = O(N)
//space complexity = O(1)