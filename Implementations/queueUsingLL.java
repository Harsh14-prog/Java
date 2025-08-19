package Implementations;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class queueUsingLL {

    Node front;
    Node rear;

    queueUsingLL() {
        front = null;
        rear = null;
    }

    // Enqueue
    public void add(int val) {
        Node newNode = new Node(val);
        if (front == null) { // empty queue
            front = rear = newNode;
        } else {
            rear.next = newNode; // link new node at end
            rear = newNode;      // update rear pointer
        }
    }

    // Dequeue
    public int poll() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = front.data;
        front = front.next;       // move front pointer
        if (front == null) {      // if queue becomes empty
            rear = null;
        }
        return removed;
    }

    // Peek
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public static void main(String[] args) {
        queueUsingLL queue = new queueUsingLL();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.poll()); // 10
        System.out.println(queue.peek()); // 20
    }
}
