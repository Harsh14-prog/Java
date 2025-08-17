package Queue ;

import java.util.LinkedList;
import java.util.Queue;

public class reverse {

    public static void qreverse(Queue <Integer> q){

       if (q.isEmpty()){
        return ;
       }

       int front = q.peek();
       q.poll();

       qreverse(q);
       q.add(front);
    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        qreverse(q);
        System.out.println("given queue is : " + q);
    }
}