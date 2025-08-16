package stack;

class Stack {
    int top;
    int size;
    int[] arr;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int val) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = val;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            arr[top] = 0;
            top--;
        }
    }

    void capacity() {
        System.out.println("Current elements count: " + (top + 1));
    }

    void print() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class implementStackUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack(10);

        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        st.print(); 
    }
}
