package LinkedList.IntersectionOfLL;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class bruteForce {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA;

        // For each node in A, scan entire B
        while (ptrA != null) {
            ListNode ptrB = headB;
            while (ptrB != null) {
                if (ptrA == ptrB) {  // compare references, not values
                    return ptrA;
                }
                ptrB = ptrB.next;
            }
            ptrA = ptrA.next;
        }
        return null; // no intersection
    }

    public static void main(String []args){
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(1);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(4);

        ListNode head2 = new ListNode(3);
        head2.next = head1.next.next.next;
        head2.next.next = head1.next.next.next.next;


        ListNode common = getIntersectionNode(head1, head2);
        if(common!=null) {
            System.out.println("The intersection node is: " + common.val);
        }
        else{
            System.out.println("The intersection node is: " + common);
        }
    }
}

//time complexity = O(M * N)
//space complexity = O(1)