package BinarySearch;

public class FirstAndLastOccur {

    public static int findFirst(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int first = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                first = mid;
                h = mid - 1; // continue searching left part
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return first;
    }

    public static int findLast(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int last = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                last = mid;
                l = mid + 1; // continue searching right part
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return last;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 6, 8, 10};
        int target = 4;

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
