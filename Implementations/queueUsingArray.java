package Implementations;

public class queueUsingArray {

    int[] arr;
    int capacity;
    int front;
    int rear;

    queueUsingArray(int size) {
        arr = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
    }

    public void add(int val) {

        if (rear == capacity - 1) {
            throw new RuntimeException("Queue overflow");
        } 
        else if (front == -1 && rear == -1) { // first element
            front = 0;
            rear = 0;
            arr[rear] = val;
        } 
        else {
            rear++;
            arr[rear] = val;
        }
    }

    public int poll() {
        
        if (front == -1) {
            throw new RuntimeException("Queue underflow");
        } 
        
        int val = arr[front];

        if (front == rear) { // single element
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return val;
    }

    public int peek() {
        if (front == -1) {
            throw new RuntimeException("Queue is empty");
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return front == -1;  // queue is empty if front == -1
    }

    public static void main(String[] args) {
        queueUsingArray q = new queueUsingArray(5);

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.poll()); // 10
        System.out.println(q.peek()); // 20
        System.out.println(q.isEmpty()); // false

        q.add(40);
        System.out.println(q.poll()); // 20
        System.out.println(q.poll()); // 30
        System.out.println(q.poll()); // 40
        System.out.println(q.isEmpty()); // true
    }
}
