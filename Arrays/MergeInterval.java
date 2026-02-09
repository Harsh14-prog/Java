package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

    public static int Merge(int[][] nums) {

        List<int[]> ans = new ArrayList<>();

        Arrays.sort(nums, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < nums.length; i++) {
            if (ans.isEmpty()) {
                ans.add(new int[] { nums[i][0], nums[i][1] }); // first interval
            } 
            else if (nums[i][0] <= ans.get(ans.size() - 1)[1]) {
                // overlapping
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], nums[i][1]);
            } 
            else {
                // no overlap
                ans.add(new int[] { nums[i][0], nums[i][1] });
            }
        }

        int totalLength = 0;

        for (int[] arr : ans) {
            totalLength = totalLength + (arr[1] - arr[0]);
        }
        return totalLength;

    }

    public static void main(String[] args) {
        int[][] intervals = { { 5, 10 }, { 8, 12 } };
        int ans = Merge(intervals);

        System.out.println(ans);
    }
}
