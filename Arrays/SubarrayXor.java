package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarrayXor {

    public static void main(String[] args) {
       int[] arr = {4,2,2,6,4};
       int n = arr.length ;
       int k = 6 ;

       int count = 0 ;
       int xr = 0 ;

      Map <Integer , Integer> mp = new HashMap<>();
      mp.put(xr , mp.getOrDefault(xr , 0)+1);

      for (int i = 0 ; i < n ; i++){
         
         xr = xr ^ arr[i];

         if (mp.containsKey(xr ^ k)){
            count = count + mp.get(xr ^ k);
         }
         mp.put(xr , mp.getOrDefault(xr , 0)+1);

      }
      System.out.println(count);
    }
}
