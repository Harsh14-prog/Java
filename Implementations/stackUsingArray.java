package Implementations;

public class stackUsingArray {

    int[] arr;
    int capacity;
    int top;

    stackUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int val) {
        
        if (top == capacity - 1) { 
            throw new RuntimeException("Stack overflow");
        }
        arr[++top] = val;  // increment top then push to that top
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack underflow");
        }
        return arr[top--];   // pop current top then decrement
    }

    public int top() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {

        stackUsingArray stack = new stackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.top()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.top()); 
    }
}
