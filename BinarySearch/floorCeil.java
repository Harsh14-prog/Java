package BinarySearch;

public class floorCeil {

    public static int findFloor(int nums[], int n, int x) {

        int l = 0;
        int h = n - 1;
        int floor = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] <= x) {
                floor = nums[mid];
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return floor;
    }

    public static int findCeil(int nums[], int n, int x) {
        int l = 0;
        int h = n - 1;
        int ceil = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] >= x) {
                ceil = nums[mid];
                h = mid - 1; 
            } else {
                l = mid + 1; 
            }
        }
        return ceil;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 4, 7, 8, 10 };
        int n = nums.length;
        int x = 5;

        int ans = findFloor(nums, n, x);
        System.out.println(ans);

        int ans2 = findCeil(nums, ans, x);
        System.out.println(ans2);

    }
}
