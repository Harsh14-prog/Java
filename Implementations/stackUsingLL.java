package Implementations;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class stackUsingLL {

    Node top;

    stackUsingLL() {
        top = null;
    }

    public void push(int val) {

        if (top == null) {
            Node newNode = new Node(val);
            top = newNode;
        } else {
            Node newNode = new Node(val);
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (top == null) {
            System.out.println("stack is empty");
            return -1;
        } else {
            int popped = top.data;
            top = top.next;
            return popped;
        }
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        stackUsingLL stack = new stackUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is " + stack.peek());

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}
