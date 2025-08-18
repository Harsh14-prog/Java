package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class slidingWindMaxMinSum {

    public static int slidingWindowOps(int[] arr, int k){
        int n = arr.length;
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Remove indices out of window
            if (!maxDeque.isEmpty() && maxDeque.getFirst() < i - k + 1) maxDeque.pollFirst();
            if (!minDeque.isEmpty() && minDeque.getFirst() < i - k + 1) minDeque.pollFirst();

            // Remove smaller elements for maxDeque
            while (!maxDeque.isEmpty() && arr[maxDeque.getLast()] <= arr[i]) maxDeque.pollLast();
            // Remove larger elements for minDeque
            while (!minDeque.isEmpty() && arr[minDeque.getLast()] >= arr[i]) minDeque.pollLast();

            maxDeque.addLast(i);
            minDeque.addLast(i);

            if (i >= k - 1) {
                sum += arr[maxDeque.getFirst()] + arr[minDeque.getFirst()];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int sum = slidingWindowOps(arr, k);
        System.out.println("Sum of max+min of each window: " + sum);
    }
}
