package revise;

public class largestEle {
    public static void main(String[] args) {
        int[] nums = {8, 10, 5, 7, 9};
        int n = nums.length;

        int num = nums[0];

        for(int i = 1 ; i < n ; i++){
            if(nums[i] > num){
                num = nums[i];
            }
        }
        System.out.println(num);
    }
}
