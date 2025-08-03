package Arrays;

import java.util.Map;
import java.util.HashMap;

public class sumZeroSubarr {
    
    public static void main(String[] args) {
        int[] arr = {1,-1,3,2,-2,-8,1,7,10,2,3};
        int  maxLength = 0 ;
        int n = arr.length ;
        int sum = 0 ;

        Map <Integer , Integer> mp = new HashMap<>();

        for (int i = 0 ; i < n ; i++){
           sum = sum + arr[i];

           if (sum == 0){
            maxLength = i+1 ;
           }

           if (mp.containsKey(sum)){
             maxLength = Math.max(maxLength , i - mp.get(sum));
           }
           else {
            mp.put(sum , i);
           }
        }
        System.out.println(maxLength);
    }
}
