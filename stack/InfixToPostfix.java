package stack;

import java.util.Stack;

public class InfixToPostfix {

    public static int priority(char c){
        switch(c) {
            case '+':
            case '-' :
                return 1;   // lowest priority
            case '*' :
            case '/' :
            case '%' :
                return 2;
            case '^' :
                return 3;   // highest priority
        }
        return -1;
    }

public static String convertedPostfix(String s){
    
        String postfix = "";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If operand, add to postfix
            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            }
            // If '(', push to stack
            else if (c == '(') {
                st.push(c);
            }
            // If ')', pop until '('
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    postfix += st.pop();
                }
                if (!st.isEmpty()) st.pop(); // remove '('
            }
            // If operator
            else {
                while (!st.isEmpty() && priority(st.peek()) >= priority(c)) {
                    postfix += st.pop();
                }
                st.push(c);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            postfix += st.pop();
        }

        return postfix;
    }

  public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Postfix: " + convertedPostfix(exp));
  }
}
