package LinkedList.SortLL012;

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
    public static Node sortListBrute(Node head) {
        if (head == null || head.next == null) return head;

        int count0 = 0, count1 = 0, count2 = 0;

        // Pass 1: Count 0s, 1s, 2s
        Node current = head;
        while (current != null) {
            if (current.data == 0) count0++;
            else if (current.data == 1) count1++;
            else count2++;
            current = current.next;
        }

        // Pass 2: Overwrite values
        current = head;
        while (current != null) {
            if (count0 > 0) {
                current.data = 0;
                count0--;
            } else if (count1 > 0) {
                current.data = 1;
                count1--;
            } else {
                current.data = 2;
                count2--;
            }
            current = current.next;
        }

        return head;
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

        Node newHead = sortListBrute(head);
        printList(newHead);
    }
}

//time complexity = O(N)
//space complexity = O(1)