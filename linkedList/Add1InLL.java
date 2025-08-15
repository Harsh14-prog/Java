package linkedList;

class Node {
  
    int data ;
    Node next ;

    Node(int data){
        this.data = data ;
        this.next = null ;
    }
}

public class Add1InLL {

    public static Node createLL(int[] values){
      
        Node newNode = new Node(values[0]);
        Node temp = newNode ;

        for (int i = 1 ; i < values.length ; i++){
            temp.next = new Node(values[i]);
            temp = temp.next ;
        }
        return newNode ;
    }

    public static void display(Node head){
        Node temp = head ;

        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.print("null");
    }

    public static Node reverse(Node head){
        Node prev = null ;
        Node current = head ;

        while (current != null){
            Node forward = current.next ;
            current.next = prev ;
            prev = current ;
            current = forward ;
        }
        return prev ;
    }

    public static Node add1InLL(Node head){
        
        Node newHead = reverse(head);
        Node temp = newHead ;
        int carry = 1 ;

        while (temp != null){
            int sum = temp.data + carry ;
            temp.data = sum % 10 ;
            carry = sum/10 ;

            if (carry == 0){
                break ;
            }

            if (temp.next == null && carry > 0){
               temp.next = new Node(carry);
               break ;
            }

            temp = temp.next ;
        }

        Node reversedHead =  reverse(newHead);
        return reversedHead ;
    }
    public static void main(String[] args) {
        
        int[] values = {9,9,9,9};

        Node head = createLL(values);
        // display(head);

        Node addedLL = add1InLL(head);
        display(addedLL);
    }
}
