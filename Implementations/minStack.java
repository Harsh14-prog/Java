package Implementations;

import java.util.Stack;

class pair {
    int value;
    int min;

    pair(int value, int min) {
        this.value = value;
        this.min = min;
    }
}

public class minStack {

    Stack<pair> st;

    minStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(new pair(val, val));
        } else {
            int currentMin = Math.min(val, st.peek().min);
            st.push(new pair(val, currentMin));
        }
    }

    public int pop() {
        if (!st.isEmpty()) {
            return st.pop().value;
        }
        return -1;
    }

    public int getMin() {
        if (!st.isEmpty()) {
            return st.peek().min; // peek instead of pop
        }
        return -1;
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek().value;
        }
        return -1;
    }

    public static void main(String[] args) {
        minStack mt = new minStack();
        mt.push(10);
        mt.push(40);
        mt.push(130);
        mt.push(20);
        mt.push(134);

        System.out.println(mt.pop());     
        System.out.println(mt.top());     
        System.out.println(mt.getMin());  
    }
}
