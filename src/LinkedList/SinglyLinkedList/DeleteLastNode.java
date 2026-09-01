package LinkedList.SinglyLinkedList;

public class DeleteLastNode {

    public static Node deleteLastNode(Node head){

        if (head == null || head.next == null) {
            return null;
        }

        Node curr = head;
        while(curr.next.next!=null){
            curr= curr.next;
        }

        curr.next = null;
        return head;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){

        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        Node lastNode = head.next.next;

        System.out.print("The original List: ");
        printList(head);

        deleteLastNode(head);

        System.out.print("The updated List after deleting last Node: ");
        printList(head);

    }
}

//time complexity = O(N)
//space complexity = O(1)