package LinkedList.ReverseLL;
import java.util.*;

// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    // Function to reverse a linked list using stack
    public ListNode reverseList(ListNode head) {
        // Stack to store values of nodes
        Stack<Integer> stack = new Stack<>();

        // Temporary pointer to traverse the list
        ListNode temp = head;

        // Traverse and push all node values to stack
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        // Reset temp back to head
        temp = head;

        // Reassign values from stack in reverse order
        while (temp != null) {
            temp.val = stack.pop();
            temp = temp.next;
        }

        // Return the modified head
        return head;
    }
}

public class BruteForce {

    public static void main(String[] args) {
        // Creating linked list 1 -> 2 -> 3 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        Solution sol = new Solution();
        head = sol.reverseList(head);

        System.out.print("\nThe reversed LL is: ");
        // Printing reversed list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

}

//time complexity = O(N)
//space complexity = O(N)