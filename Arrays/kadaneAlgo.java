package Arrays;

// To find max sum subarray using Kadane's Algorithm
public class kadaneAlgo {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        int start = 0;         
        int end = 0;           
        int tempstart = 0;     

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                start = tempstart;   // update start only when potential subarray find
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempstart = i + 1;   // fresh start as sum is negative
            }
        }

        //  Print the max sum subarray
        System.out.print("Maximum Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMaximum Sum: " + maxi);
    }
}
