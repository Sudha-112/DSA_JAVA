package LinkedList.SinglyLinkedList;

public class LengthOfLL {

    public static int findLength(Node head){

        if(head == null){
            return 0;
        }
         int length = 1;
         Node temp = head;
         while(temp.next != null){
             length++;
             temp = temp.next;
         }
         return length;
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        System.out.print("The LL: ");
        printList(head);
        System.out.println("The length of LL is: " + findLength(head));

    }
}

//time complexity = O(N)
//space complexity = O(1)