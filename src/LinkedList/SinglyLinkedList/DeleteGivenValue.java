package LinkedList.SinglyLinkedList;

public class DeleteGivenValue {

    public static Node delete(Node head, int value){

        if(head == null) return null;

        // Case 1: value head me hai
        if(head.data == value){
            return head.next;
        }

        // Case 2: value beech ya end me hai
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == value){
                temp.next = temp.next.next;  // link skip kar do
                return head;
            }
            temp = temp.next;
        }

        // Value list me mila hi nahi
        System.out.println(value + " not found in the list.");
        return head;
    }

    public static void main(String[] args){
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(10);
        head.next.next.next = new Node(20);

        System.out.print("The original ll: ");
        LengthOfLL.printList(head);

        head = delete(head, 10);
        System.out.print("The updated List after deletion :");
        LengthOfLL.printList(head);
    }
}
//time complexity = O(N)
//space complexity = O(1)