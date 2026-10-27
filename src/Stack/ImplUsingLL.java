package Stack;

// Step 1: Node - linked list ka ek dabba (data + agle node ka address)
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Step 2: Stack - top hamesha linked list ka pehla node (head) hota hai
class Stackk {
    Node top = null;   // shuru mein stack khali hai
    int length;
    // PUSH: naya node top pe lagao
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;   // naya node purane top ko point kare
        top = newNode;        // ab naya node hi top hai
        length++;
    }

    // POP: top wala node hatao aur uski value return karo
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        length--;
        int value = top.data;
        top = top.next;       // top ko agle node pe le jao
        return value;
    }

    // PEEK: top ki value dekho, hatao mat
    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // Stack khali hai ya nahi
    boolean isEmpty() {
        return top == null;
    }

    // Poora stack print karo
    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int size(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }

        return length;
    }
}


public class ImplUsingLL {

    public static void main(String[] args) {
        Stackk s = new Stackk();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();                  // 30 20 10

        System.out.println(s.pop());  // 30
        System.out.println(s.peek()); // 20
        s.display();                  // 20 10
        System.out.println(s.size());
    }

}
// time complexity = O(1)
// space complexity = O(N)
