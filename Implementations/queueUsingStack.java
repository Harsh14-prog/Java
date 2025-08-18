package Implementations;

import java.util.Stack;

public class queueUsingStack {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    // Add element to queue
    public void add(int val) {
        st1.push(val);
    }

    // Peek front element
    public int peek() {
        if (st2.isEmpty()) { // transfer only if st2 is empty
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        if (st2.isEmpty()) throw new RuntimeException("Queue is empty");
        return st2.peek();
    }

    // Remove front element
    public int poll() {
        if (st2.isEmpty()) { // transfer only if st2 is empty
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        if (st2.isEmpty()) throw new RuntimeException("Queue is empty");
        return st2.pop(); // remove and return
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return st1.isEmpty() && st2.isEmpty();
    }

    public static void main(String[] args) {
        queueUsingStack queue = new queueUsingStack();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println(queue.poll()); 
        System.out.println(queue.poll()); 
        System.out.println(queue.peek()); 
        System.out.println(queue.isEmpty()); 
    }
}
