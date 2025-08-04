package BinarySearch;

public class singleEleInSorted {

    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int l = 1, h = n - 2;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return -1; 
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int result = singleNonDuplicate(nums);
        System.out.println("Single non-duplicate element: " + result);
    }
}

