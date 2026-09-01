package LinkedList.SinglyLinkedList;

public class HeadInsertion {

    // Function to insert a new node at the head
    public static Node insertAtHead(Node head, int newData) {
        // Create a new node whose next points to current head
        Node newNode = new Node(newData, head);
        // Return the new node as the head
        return newNode;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args){

        Node head = new Node(2);
        head.next = new Node(3);

        System.out.print("Original List: ");
        printList(head);

       head = insertAtHead(head, 1);

        System.out.print("New List: ");
        printList(head);

    }
}

//time complexity = O(1)
//space complexity = O(1)
