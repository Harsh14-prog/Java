package Implementations;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
    
    Queue <Integer> q = new LinkedList<>();
   
    public void push(int val){

      q.add(val);

      for (int i = 0 ; i < q.size()-1 ; i++){
        q.add(q.poll());
      }
    }

    public int pop(){
        if(q.isEmpty()) throw new RuntimeException("stack is empty");
        return q.poll();
    }

    public int top(){
        if (q.isEmpty()) throw new RuntimeException("Stack is empty");
        return q.peek();
    }

    public boolean isEmpty(){
       return q.isEmpty();
    }
    
    public static void main(String[] args) {
        stackUsingQueue stack = new stackUsingQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
