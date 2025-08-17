package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseIterative {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Add elements
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Original Queue: " + q);

        // Step 1: Move all elements from Queue -> Stack
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) {
            st.push(q.poll());
        }

        // Step 2: Move all elements back from Stack -> Queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        System.out.println("Reversed Queue: " + q);
    }
}
