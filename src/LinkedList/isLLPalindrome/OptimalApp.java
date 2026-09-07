package LinkedList.isLLPalindrome;

public class OptimalApp {

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find middle using slow/fast pointers
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalfStart = reverse(slow);
        Node secondHalfCopy = secondHalfStart; // keep reference to restore later

        // Step 3: Compare first half and reversed second half
        Node firstHalf = head;
        boolean result = true;
        while (secondHalfStart != null) {
            if (firstHalf.data != secondHalfStart.data) {
                result = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalfStart = secondHalfStart.next;
        }

        // Step 4: Restore the list (optional, good practice)
        reverse(secondHalfCopy);

        return result;
    }

    // Reverses a linked list and returns new head
    private static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node nextTemp = head.next;
            head.next = prev;
            prev = head;
            head = nextTemp;
        }
        return prev;
    }

    // Helper to build a linked list from an array
    private static Node buildList(int[] arr) {
        Node dummy = new Node(0);
        Node curr = dummy;
        for (int v : arr) {
            curr.next = new Node(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node head = buildList(new int[]{1, 2, 3, 2, 1});
        System.out.println("Is Palindrome: " + isPalindrome(head)); // true

        Node head2 = buildList(new int[]{1, 2, 3, 4});
        System.out.println("Is Palindrome: " + isPalindrome(head2)); // false
    }
}

//time complexity = O(n)
//space complexity = O(1)