package linkedList;

public class Add1InLLRecursive {

    public static Node createLL(int[] values) {

        Node newNode = new Node(values[0]);
        Node temp = newNode;

        for (int i = 1; i < values.length; i++) {
            temp.next = new Node(values[i]);
            temp = temp.next;
        }
        return newNode;
    }

    public static int add1InLL(Node temp){

        if (temp == null){
           return 1 ;
        }
        int carry = add1InLL(temp.next);
        int sum = temp.data + carry ;
        temp.data = sum % 10 ;
        carry = sum / 10 ;
        return carry ;
    }

    public static void display(Node head){
        Node temp = head ;

        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.print("null");
    }

public static void main(String[] args) {
    int[] values = { 9, 9, 9, 9 };
    Node head = createLL(values);

    int ansCarry = add1InLL(head);

    if (ansCarry > 0){
        Node newNode = new Node(ansCarry);
        newNode.next = head; // link new node to current head
        head = newNode;
    }

    display(head); // Output: 1->0->0->0->0->null
}

}
