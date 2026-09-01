package LinkedList.SinglyLinkedList;

public class InsertAfterGivenValue {

    public static void insert(Node head, int number, int nextTo){
        Node temp = head;
        while(temp != null){
            if(temp.data == nextTo){
                Node newNode = new Node(number);
                Node add = temp.next;
                temp.next = newNode;
                newNode.next = add;
                return;
            }
                temp = temp.next;
        }
        System.out.println(nextTo + " not found in the list. Insertion failed.");
    }

    public static void main(String[] args){
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(10);

        System.out.print("The original ll: ");
        LengthOfLL.printList(head);

        insert(head,3,11);

        System.out.print("The New LL: ");
        LengthOfLL.printList(head);
    }
}
