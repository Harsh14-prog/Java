package BinarySearch;

public class totalOccuranceOfTarget {

    public static int findFirst(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int first = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                first = mid;
                h = mid - 1;
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
                l = mid + 1;
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

        int totalOccurrences = 0;
        if (first != -1 && last != -1) {
            totalOccurrences = last - first + 1;
        }

        System.out.println("Total Occurrences of " + target + ": " + totalOccurrences);
    }
}
