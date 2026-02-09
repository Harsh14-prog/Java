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
                // this is tempstart , we do not know either this will give max sum
                // or not after addn with other next ele
                // if we directly do start + 1 that means we are assuming this start will give 
                // max sum , but it just start know that +ve number sum
                // change start only when we get max sum than prev
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
