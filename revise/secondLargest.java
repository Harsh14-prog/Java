package revise;

public class secondLargest {
    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 7, 7, 5};
        int n = nums.length ;

        int largest = nums[0];
        int slargest = Integer.MIN_VALUE;

        for(int i = 1 ; i < n ; i++){
          
            if(nums[i] > largest){
                slargest = largest ;
                largest = nums[i];
            }
            else if(nums[i] != largest && nums[i] > slargest){
                slargest = nums[i];
            }
        }

        System.out.println(slargest);
    }
}
