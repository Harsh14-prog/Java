package stack;

import java.util.Stack;

public class NGE1 {
    public static void main(String[] args) {

        int[] arr = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };

        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[i] > st.peek()) {
                st.pop();
            }

            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " -> " + nge[i]);
        }

    }
}
