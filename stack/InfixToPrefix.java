package stack;

import java.util.Stack;

public class InfixToPrefix {

    public static int priority(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPrefix(String s) {
        // Step 1: Reverse the infix string
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '(') {
                reversed.append(')');
            } else if (c == ')') {
                reversed.append('(');
            } else {
                reversed.append(c);
            }
        }

        StringBuilder postfix = new StringBuilder();
        Stack<Character> st = new Stack<>();

        // Step 2: Convert reversed infix to postfix
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix.append(st.pop());
                }
                if (!st.isEmpty()) st.pop();
            } else { // operator
                while (!st.isEmpty() &&
                       (priority(st.peek()) > priority(c) ||
                       (priority(st.peek()) == priority(c) && c != '^'))) {
                    postfix.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            postfix.append(st.pop());
        }

        // Step 3: Reverse postfix → prefix
        return postfix.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "(A+B)*C-D+F";
        System.out.println("Infix:   " + s);
        System.out.println("Prefix:  " + infixToPrefix(s));

        // Extra tests
        System.out.println("A^B^C → " + infixToPrefix("A^B^C"));
        System.out.println("A+B*C → " + infixToPrefix("A+B*C"));
        System.out.println("(A+B)*(C+D) → " + infixToPrefix("(A+B)*(C+D)"));
    }
}
