package stack ;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] NSE = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from stack while they are greater or equal
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // If stack is empty, NSE is -1, else top of stack
            NSE[i] = st.isEmpty() ? -1 : st.peek();

            // Push current element onto stack
            st.push(arr[i]);
        }

        // Print the Next Smaller Elements
        for (int ele : NSE) {
            System.out.print(ele + " ");
        }
    }
}
