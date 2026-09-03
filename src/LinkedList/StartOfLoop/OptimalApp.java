package LinkedList.StartOfLoop;

public class OptimalApp {

    public static Node detectLoop(Node head){

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }

            return slow;
        }
        }
        return null;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        // with a loop for testing
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Create a loop
        fifth.next = third;

        Node loopStart = detectLoop(head);
        if(loopStart!=null){
            System.out.print("\nThe starting point of loop is : " + loopStart.data);
        }else{
            System.out.print("\nLoop not existed");
        }
        System.out.println();

    }
}

//time complexity = O(N)
//space complexity = O(1)