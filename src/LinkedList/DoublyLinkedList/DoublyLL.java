package LinkedList.DoublyLinkedList;

class Node{

    int data;    //stores data of node
    Node prev;   //Pointer to the previous node
    Node next;   //Pointer to the next node

    Node(int data1, Node prev1, Node next1){
        data = data1;
        prev = prev1;
        next = next1;
    }

    Node(int data1){
        data = data1;
        prev = null;
        next = null;
    }

}

public class DoublyLL {

    public static void main(String[] args){

        int[] arr = {1,2,3,4};

        Node head = new Node(arr[0]);

        System.out.println(head);
        System.out.println(head.data);
        System.out.println(head.prev);
        System.out.println(head.next);

    }
}
