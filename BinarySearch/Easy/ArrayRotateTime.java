package BinarySearch.Easy;

public class ArrayRotateTime {

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };
        int n = nums.length;

        int l = 0;
        int h = n - 1;
        int mini = Integer.MAX_VALUE ; 
        int index = -1 ;

        if (n == 1){
           index = 0 ;
        }

        while (l <= h) {

           int mid = l + (h-l) / 2 ;

           if (nums[l] <= nums[h]){
              index = l; 
              break ;
           }

           if (nums[l] <= nums[mid]){
             if (nums[l] < mini){
                mini = nums[l];
                index = l ;
             }
             l = mid + 1 ;
           }
           else if (nums[mid] <= nums[h]) {
              if (nums[mid] < mini){
                mini = nums[mid] ;
                index = mid ;
              }
              h = mid - 1 ;
           }
        }
        System.out.println(index) ;
    }
}
