package BinarySearch.Medium;

public class kthMissing {

    public static int findMissing(int[] nums , int k){

        int n = nums.length ;
        int l = 0 ;
        int h = n-1 ;

        while (l <= h){
            int mid = l + (h-l)/2 ;

            int missing = nums[mid] - (mid + 1);

            if (missing < k){
                l = mid + 1 ;
            }
            else {
                h = mid - 1 ;
            }
        }

        if (h == -1){
            return k ;
        }

        int missing = nums[h] - (h + 1);

        int missingNumber = nums[h] + (k-missing);
        return missingNumber ;

    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,7,11};
        int k = 5 ;

        int ans = findMissing(nums , k);
        System.out.println(ans);
    }
}
