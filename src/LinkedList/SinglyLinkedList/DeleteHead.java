package LinkedList.SinglyLinkedList;

public class DeleteHead {

    public static Node deleteHead(Node head){

       if (head == null || head.next == null)  return null;
       return head.next;

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

        System.out.print("The original List: ");
        printList(head);

        head = deleteHead(head);

        System.out.print("The updated List after deleting head: ");
        printList(head);

    }
}
