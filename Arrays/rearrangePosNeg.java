package Arrays;

import java.util.*;

public class rearrangePosNeg {

    // Brute Force 
    public static int[] rearrangeBrute(int[] nums) {

        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : nums) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int[] result = new int[n];
        int i = 0, p = 0, q = 0;

        // Alternate positives and negatives
        while (p < pos.size() && q < neg.size()) {
            result[i++] = pos.get(p++);
            result[i++] = neg.get(q++);
        }

        // Add remaining positives
        while (p < pos.size()) result[i++] = pos.get(p++);

        // Add remaining negatives
        while (q < neg.size()) result[i++] = neg.get(q++);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, -3, -4, 5, -6, -7, 8};

        int[] rearranged = rearrangeBrute(nums);

        System.out.println("Rearranged Array (Brute Force):");
        System.out.println(Arrays.toString(rearranged));
    }
}



// optimal -----------------

//  package Arrays;

// import java.util.Arrays;

// public class rearrangePosNeg {

//     // Optimal Approach
//     public static int[] rearrangeOptimal(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];
//         int pos = 0, neg = 1;

//         for (int num : nums) {
//             if (num >= 0 && pos < n) {
//                 result[pos] = num;
//                 pos += 2;
//             } else if (num < 0 && neg < n) {
//                 result[neg] = num;
//                 neg += 2;
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, -3, -4, 5, -6, -7, 8};

//         int[] rearranged = rearrangeOptimal(nums);

//         System.out.println("Rearranged Array (Optimal):");
//         System.out.println(Arrays.toString(rearranged));
//     }
// }
