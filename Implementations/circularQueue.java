package Implementations;

public class circularQueue {

    int[] arr;
    int capacity;
    int front;
    int rear;

    circularQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
    }

    // Add element 
    public void add(int val) {
        if ((rear == capacity - 1 && front == 0) || (rear == front - 1)) {
            throw new RuntimeException("queue overflow");
        } else if (front == -1 && rear == -1) {
            rear++;
            arr[rear] = val;
            front++;
        } else if (rear == capacity - 1 && front != 0) {
            rear = 0;
            arr[rear] = val;
        } else {
            rear++;
            arr[rear] = val;
        }
    }

    // Remove element 
    public int poll() {
        if (front == -1 && rear == -1) {
            throw new RuntimeException("queue underflow");
        }

        int val = arr[front];
        
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == capacity - 1) {
            front = 0; 
        } else {
            front++;
        }
        return val;
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return arr[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if queue is full
    public boolean isFull() {
        return (rear == capacity - 1 && front == 0) || (rear == front - 1);
    }

    // Current size
    public int size() {
        if (front == -1) return 0;
        if (rear >= front) {
            return rear - front + 1;
        } else {
            return capacity - front + rear + 1;
        }
    }

    // Display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = front; i < capacity; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        circularQueue cq = new circularQueue(5);

        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.display(); // 10 20 30 40

        System.out.println("Polled: " + cq.poll()); // 10
        cq.display(); // 20 30 40

        cq.add(50);
        cq.add(60);
        cq.display(); // 20 30 40 50 60

        System.out.println("Peek: " + cq.peek()); // 20
        System.out.println("Size: " + cq.size()); // 5
        System.out.println("Is full? " + cq.isFull()); // true
    }
}
