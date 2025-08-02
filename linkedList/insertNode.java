package linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class insertNode {
    Node head;
    Node tail;

    // Insert at tail in O(1)
    public void insertAtTail(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert at head
    public void insertAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (tail == null) tail = head; // First node
    }

    // Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        insertNode list = new insertNode();

        list.insertAtHead(10);  
        list.insertAtTail(20);  
        list.insertAtTail(30);  
        list.insertAtHead(5);    

        list.display();
    }
}
