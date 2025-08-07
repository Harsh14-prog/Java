package BinarySearch.Medium;

import java.util.Arrays;

public class splitArrayLargestSumMin {

    public static boolean canWeSplit(int[] nums , int sum , int k){
        int subarrayCount = 1 ;
        int subarraySum = 0 ;

        for (int i = 0 ; i < nums.length ; i++){
            if (subarraySum + nums[i] <= sum){
                subarraySum += nums[i] ;
            }
            else {
                subarrayCount++ ;
                subarraySum = nums[i];
            }
        }
        return subarrayCount <= k ;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 3 ;

        // min(max sum of subarray) pattern
        int l = Arrays.stream(arr).max().getAsInt();
        int h = Arrays.stream(arr).sum();

        int ans = -1 ;

        while (l <= h){
            int mid = l + (h-l)/2 ;

            if (canWeSplit(arr , mid , k)){
                ans = mid ;
                h = mid - 1 ;
            }
            else {
                l = mid + 1 ;
            }
        }
        System.out.println(ans);
    }
}
