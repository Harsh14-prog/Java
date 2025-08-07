package BinarySearch.Easy;

public class searchInsert {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int n = nums.length;
        int l = 0;
        int h = n - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                System.out.println(mid);
                return; 
            } 
            else if (nums[mid] > target) {
                h = mid - 1;
            } 
            else {
                l = mid + 1;
            }
        }

        // If not found, l is the insert position
        System.out.println(l);
    }
}
