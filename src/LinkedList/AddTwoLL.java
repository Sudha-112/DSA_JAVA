package LinkedList;


// Definition for singly-linked list.

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoLL {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //Initialize a dummy node as a new node
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int carry = 0;
        //Iterate till the end of both the lists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            //Repeat the same process for l2 as l1
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            //Carry gets added to sum in the node (carry=sum/10)
            sum += carry;
            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
        }

        return dummy.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(7);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(8);
        head2.next.next = new ListNode(1);

        ListNode result = addTwoNumbers(head1, head2);
        printList(result); // Output: 6 -> 0 -> 9
    }
}

//time complexity = O(max(m,n))
//space complexity = O(max(m,n))