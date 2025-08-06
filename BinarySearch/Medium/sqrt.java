package BinarySearch.Medium;

public class sqrt {
    public static void main(String[] args) {

        int n = 28;
        int l = 1;
        int h = n;
        int ans = 0; 

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (mid <= n / mid) { 
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        System.out.println("Square root (floor) of " + n + " is: " + ans);
    }
}
