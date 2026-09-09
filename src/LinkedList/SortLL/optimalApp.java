package LinkedList.SortLL;

public class optimalApp {

    public static Node mergeTwoSortedLinkedLists(Node list1, Node list2) {
        // Create a dummy node
        Node dummyNode = new Node(-1, null);

        // Temp pointer to build merged list
        Node temp = dummyNode;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            // Choose smaller node
            if (list1.data <= list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            // Move temp pointer
            temp = temp.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        // Return head of merged list
        return dummyNode.next;
    }

    // Function to find middle of linked list
    public static Node findMiddle(Node head) {
        // If list empty or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Slow and fast pointers
        Node slow = head;
        Node fast = head.next;

        // Move fast twice as fast as slow
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Return middle node
        return slow;
    }

    // Function to perform merge sort
    public static Node sortLL(Node head) {
        // Base case: empty or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle node
        Node middle = findMiddle(head);

        // Split into two halves
        Node right = middle.next;
        middle.next = null;
        Node left = head;

        // Recursively sort both halves
        left = sortLL(left);
        right = sortLL(right);

        // Merge sorted halves
        return mergeTwoSortedLinkedLists(left, right);
    }


    // Function to print linked list
    static void printLinkedList(Node head) {
        // Temp pointer to traverse
        Node temp = head;

        // Traverse and print nodes
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 3 -> 2 -> 5 -> 4 -> 1
        Node head = new Node(3, null);
        head.next = new Node(2, null);
        head.next.next = new Node(5, null);
        head.next.next.next = new Node(4, null);
        head.next.next.next.next = new Node(1, null);

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

//time complexity = O(n*logn)
//space complexity = O(1)
