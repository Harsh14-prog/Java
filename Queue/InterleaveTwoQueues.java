package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoQueues {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.add(60);
        q1.add(70);  // Odd size example

        int size = q1.size();
        int half = size / 2;

        Queue<Integer> q2 = new LinkedList<>(); // first half
        Queue<Integer> q3 = new LinkedList<>(); // second half

        // Step 1: split q1 into q2 and q3
        for (int i = 0; i < half; i++) {
            q2.add(q1.poll());
        }
        while (!q1.isEmpty()) {
            q3.add(q1.poll());
        }

        // Step 2: interleave q2 and q3 back into q1
        while (!q2.isEmpty() && !q3.isEmpty()) {
            q1.add(q2.poll());
            q1.add(q3.poll());
        }

        // If odd element left in q3
        while (!q3.isEmpty()) {
            q1.add(q3.poll());
        }

        System.out.println("Interleaved Queue: " + q1);
    }
}
