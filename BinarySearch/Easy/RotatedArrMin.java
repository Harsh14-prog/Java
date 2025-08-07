package BinarySearch.Easy;

public class RotatedArrMin {

    public static int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int ans = Integer.MAX_VALUE;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            // If the current range is already sorted
            if (nums[l] <= nums[h]) {
                ans = Math.min(ans, nums[l]);
                break;
            }

            // If left part is sorted
            if (nums[l] <= nums[mid]) {
                ans = Math.min(ans, nums[l]);
                l = mid + 1;
            }
            // Right part is sorted
            else {
                ans = Math.min(ans, nums[mid]);
                h = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int minimum = findMin(arr);
        System.out.println("Minimum element in rotated sorted array: " + minimum);
    }
}
