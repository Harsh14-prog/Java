package BinarySearch.Easy;

public class searchTargetInRoatetedDupli {

    public static boolean search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[mid] == nums[l] && nums[mid] == nums[h]) {
                l++;
                h--;
            } else if (nums[mid] >= nums[l]) {
                if (target >= nums[l] && target < nums[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums1 = { 2, 5, 6, 0, 0, 1, 2 };
        int target1 = 0;
        System.out.println("Target " + target1 + " found: " + search(nums1, target1)); // true

        int[] nums2 = { 2, 5, 6, 0, 0, 1, 2 };
        int target2 = 3;
        System.out.println("Target " + target2 + " found: " + search(nums2, target2)); // false

        int[] nums3 = { 1, 1, 3, 1 };
        int target3 = 3;
        System.out.println("Target " + target3 + " found: " + search(nums3, target3)); // true
    }
}
