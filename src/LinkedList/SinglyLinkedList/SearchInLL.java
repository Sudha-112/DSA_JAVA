package LinkedList.SinglyLinkedList;

public class SearchInLL {

    public static boolean searchEl(Node head, int data){

        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }



    public static void main(String[] args){

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(5);

        boolean ans = searchEl(head,0);
        System.out.println(ans);
    }
}

//time complexity = O(N)
//space complexity = O(1)