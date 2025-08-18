package Implementations;

public class dequeueImplement {
    int[] arr ;
    int capacity;
    int front;
    int rear;

    dequeueImplement(int val){
        arr = new int[val];
        capacity = val ;
        front = -1 ;
        rear = -1 ;
    }

    public void addFirst(int value){

        if(front == 0){
            throw new RuntimeException("deque overflow from front");
        }

        else if (front == -1 && rear == -1){
            front++;
            arr[front] = value ;
            rear++;
        }
        else {
            front--;
            arr[front] = value ;
        }
    }

    public void addLast(int value){

        if(rear == capacity - 1){
            throw new RuntimeException("deque overflow from end");
        }

        else if (front == -1 && rear == -1){
            rear++;
            arr[rear] = value ;
            front++;
        }
        else {
            rear++;
            arr[rear] = value ;
        }
    }

    public int pollFirst(){
        if(front == -1 ){
            throw new RuntimeException("deque underflow");
        }

        int val = arr[front];

        if (front == rear){
            front = -1 ;
            rear = -1 ;
        }
        else{
            front++;
        }

        return val ;
    }

    public int pollLast(){
        if(rear == -1){
           throw new RuntimeException("deque underflow");
        }

        int val = arr[rear];

        if(rear == front){
            front = -1 ;
            rear = -1 ;
        }
        else{
            rear-- ;
        }
        return val ;
    }

    public int size(){
        if(front == -1) return 0 ;
        return (rear-front)+1;
    }

    public boolean isEmpty() {
        return front == -1;
    }
    public static void main(String[] args) {
       dequeueImplement dq =  new dequeueImplement(7);

        dq.addLast(10);
        dq.addLast(20);
        dq.addLast(5);

        System.out.println(dq.pollFirst()); // 5
        System.out.println(dq.pollLast());  // 20
        System.out.println(dq.size());      // 1
        System.out.println(dq.isEmpty());   // false
    }
}
