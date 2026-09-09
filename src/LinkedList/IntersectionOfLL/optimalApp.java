package LinkedList.IntersectionOfLL;

public class optimalApp {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){

        if(headA == null || headB == null){
            return null;
        }
        ListNode ptrA = headA;
        ListNode ptrB = headB;

        while(ptrA != ptrB){
            ptrA = (ptrA == null) ? headB : ptrA.next;
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }

        return ptrA;
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
            System.out.println("No intersection found");
        }
    }
}

//time complexity = O(M+N)
//space complexity = O(1)