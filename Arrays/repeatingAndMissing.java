package Arrays;

import java.util.ArrayList;
import java.util.List;

public class repeatingAndMissing {
    public static void main(String[] args) {

        int[] arr = {3,1,2,5,4,6,7,5};
        int n = arr.length ;

        int[] hashArr = new int[n+1];

        for (int i = 0 ; i < n ; i++){
            hashArr[arr[i]]++ ;
        }
         
        int repeating = -1 ;
        int missing = -1 ;

        for (int i = 1 ; i < hashArr.length ; i++){
            if (hashArr[i] > 1){
               repeating = i ;
            }
            if (hashArr[i] == 0){
                missing = i ;
            }
        }

        List <Integer> list = new ArrayList<>();
        list.add(repeating);
        list.add(missing);

        System.out.println(list);
    }
}
