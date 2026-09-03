package Stack;

class Stack {
    int[] arr;
    int top;
    int size;

    // Constructor
    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = value;
    }

    // Pop
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = arr[top];
        top--;

        return value;
    }

    // Peek
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    // Check empty
    boolean isEmpty() {
        return top == -1;
    }
}

public class ImplUsingArray {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); // 30
        System.out.println(stack.pop());  // 30
        System.out.println(stack.pop());  // 20
        System.out.println(stack.peek()); // 10
        System.out.println(stack.pop());  // 10
        System.out.println(stack.isEmpty()); //true
    }

}
//time complexity = O(1)
//space complexity = O(N)