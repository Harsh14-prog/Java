package BinarySearch.Medium;

import java.util.Arrays;

public class paintersPartition {

    public static boolean canHePaint(int[] boards, int time, int k) {
        int painterCount = 1;
        int painterTime = 0;

        for (int i = 0; i < boards.length; i++) {
            if (boards[i] > time) return false;  // board too big for current max time

            if (painterTime + boards[i] <= time) {
                painterTime += boards[i];
            } else {
                painterCount++;
                painterTime = boards[i];
            }
        }

        return painterCount <= k;
    }

    public static void main(String[] args) {
        int boards[] = {10, 20, 30, 40};
        int k = 2;

        int l = Arrays.stream(boards).max().getAsInt();  // painter needs max 40 to paint board as each unit length take 1 unit time  
        int h = Arrays.stream(boards).sum();

        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;  // possible max time

            if (canHePaint(boards, mid, k)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        System.out.println(ans);  
    }
}
