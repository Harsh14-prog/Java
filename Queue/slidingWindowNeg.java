package Queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class slidingWindowNeg {

    public static int[] firstNegatives(int[] arr , int k){
        Deque<Integer> dq = new LinkedList<>(); // store indices
        List<Integer> list = new ArrayList<>();

        for (int i = 0 ; i < arr.length ; i++) {
            // Remove indices out of this window
            if (!dq.isEmpty() && dq.getFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // Add current index if it's negative
            if (arr[i] < 0) {
                dq.addLast(i);
            }

            // When window is ready
            if (i >= k - 1) {
                if (!dq.isEmpty()) {
                    list.add(arr[dq.getFirst()]);
                } else {
                    list.add(0);
                }
            }
        }

        // Convert list to array
        int[] result = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {11,-1,2,3,-4,5,-6,-8,-10,-11,12,13};
        int k = 3;

        int[] ans = firstNegatives(arr, k);

        System.out.println(Arrays.toString(ans));
    }
}
