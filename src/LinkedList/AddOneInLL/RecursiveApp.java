package LinkedList.AddOneInLL;

public class RecursiveApp {

    // Function to print the list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
    }

    // Recursive function to add one from least significant digit (rightmost node)
    public static int addOneUtil(Node node) {
        // Base case: when reaching beyond last node, return carry = 1
        if (node == null) return 1;

        // Recurse to the end
        int carry = addOneUtil(node.next);
        int sum = node.data + carry;
        node.data = sum % 10;
        // Return new carry
        return sum / 10;
    }

    // Function to add one to the number represented by the linked list
   public static  Node addOne(Node head) {
        // Perform recursive addition
        int carry = addOneUtil(head);

        // If carry remains after processing the head, create a new head node
        if (carry != 0) {
            Node newHead = new Node(carry);
            newHead.next = head;
            head = newHead;
        }

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

//time complexity =  O(n) // one pass for addition
//space complexity = O(n) // recursive calls