package Implementations;

public class twoStackInArray {

    int[] arr;
    int size;
    int top1, top2;

    public twoStackInArray(int n) {
        size = n;
        arr = new int[size];
        top1 = -1;         // Stack1 starts from left
        top2 = size;        // Stack2 starts from right
    }

    // Push in stack1
    public void push1(int val) {
        if (top1 < top2 - 1) {   // check space
            top1++;
            arr[top1] = val;
        } else {
            System.out.println("Stack1 Overflow");
        }
    }

    // Push in stack2
    public void push2(int val) {
        if (top1 < top2 - 1) {   // check space
            top2--;
            arr[top2] = val;
        } else {
            System.out.println("Stack2 Overflow");
        }
    }

    // Pop from stack1
    public int pop1() {
        if (top1 >= 0) {
            int val = arr[top1];
            top1--;
            return val;
        } else {
            System.out.println("Stack1 Underflow");
            return -1;
        }
    }

    // Pop from stack2
    public int pop2() {
        if (top2 < size) {
            int val = arr[top2];
            top2++;
            return val;
        } else {
            System.out.println("Stack2 Underflow");
            return -1;
        }
    }

    // Peek stack1
    public int peek1() {
        if (top1 >= 0) return arr[top1];
        System.out.println("Stack1 is empty");
        return -1;
    }

    // Peek stack2
    public int peek2() {
        if (top2 < size) return arr[top2];
        System.out.println("Stack2 is empty");
        return -1;
    }

    // Main method to test
    public static void main(String[] args) {
        twoStackInArray ts = new twoStackInArray(10);

        ts.push1(1);
        ts.push1(2);
        ts.push1(3);

        ts.push2(100);
        ts.push2(200);
        ts.push2(300);

        System.out.println(ts.pop1()); 
        System.out.println(ts.pop2()); 
        System.out.println(ts.peek1()); 
        System.out.println(ts.peek2()); 
    }
}
