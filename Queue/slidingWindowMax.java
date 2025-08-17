package Queue;

import java.util.*;

public class slidingWindowMax {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove indices out of the current window
            if (!dq.isEmpty() && dq.getFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // Maintain decreasing order in deque
            while (!dq.isEmpty() && nums[dq.getLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            // Add maximum for current window
            if (i >= k - 1) {
                result.add(nums[dq.getFirst()]);
            }
        }

        // Convert list to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] res = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(res)); // [3, 3, 5, 5, 6, 7]
    }
}
