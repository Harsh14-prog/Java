package linkedList;

public class lengthOfLoop {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node createLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void createCycle(Node head, int pos) {
        Node temp = head;
        int index = 0;
        Node cycleNode = null;
        Node lastNode = null;

        while (temp != null) {
            if (index == pos) {
                cycleNode = temp; // node to connect the last node to
            }
            lastNode = temp; // track last node
            temp = temp.next;
            index++;
        }

        if (lastNode != null && cycleNode != null) {
            lastNode.next = cycleNode; // make the cycle
        }
    }

    public static int findlengthOfLoop(Node head){
        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null){
          fast = fast.next.next ;
          slow = slow.next ;  

          if (slow == fast){
            
            // cycle detected , find length
            fast = fast.next ;
            int count = 1 ;

            while (fast != slow){
                fast = fast.next ;
                count++ ;
            }
            return count ;
          }
        }
        return -1 ;
    } 

    public static void main(String[] args) {
        int[] values = { 10, 20, 30, 40, 50, 60 };

        Node LL = createLL(values);
        // display(LL);

        createCycle(LL, 3);

        int length = findlengthOfLoop(LL) ;
        System.out.println(length);
    }
}
