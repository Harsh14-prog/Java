package BinarySearch;

public class upperBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = arr.length;
        int x = 15;

        int l = 0;
        int h = n - 1;
        int ans = n;  

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] > x) {
                ans = mid;     // possible answer
                h = mid - 1;   // look left
            } else {
                l = mid + 1;   // look right
            }
        }

        System.out.println(ans);
    }
}
