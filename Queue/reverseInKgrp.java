package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseInKgrp {

    public static void reverse(Queue<Integer> q, int k, int count) {

        if (count < k) {
            for (int i = 0; i < count; i++) {
                q.add(q.poll());
            }
            return;
        }

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        reverse(q, k, count - k);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        q.add(110);

        int k = 3;
        int count = q.size();

        reverse(q, k, count);

        System.out.println("Reversed in groups of " + k + ": " + q);
    }
}
