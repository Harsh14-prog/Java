package Arrays;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class LongestSumSubarrPrint {

    public static void longest(int[] arr, int k) {

        int sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        int start = -1;
        int end = -1;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: subarray from 0 to i
            if (sum == k) {
                if (i + 1 > maxLength) {
                    maxLength = i + 1;
                    start = 0;
                    end = i;
                }
            }

            // Case 2: subarray from prevIndex+1 to i
            if (mp.containsKey(sum - k)) {
                int prevIndex = mp.get(sum - k);
                if (i - prevIndex > maxLength) {
                    maxLength = i - prevIndex;
                    start = prevIndex + 1;
                    end = i;
                }
            }

            // Store earliest prefix sum
            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }

        System.out.println("Longest subarray length = " + maxLength);

        if (start != -1) {
            System.out.print("Subarray = [");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i]);
                if (i < end) System.out.print(", ");
            }
            System.out.println("]");
        } else {
            System.out.println("No subarray found with sum = " + k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter sum k: ");
        int k = sc.nextInt();

        longest(arr, k);
    }
}
