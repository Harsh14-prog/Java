package Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class majority {
    public static void main(String[] args) {
        
        int[] arr = {1,1,1,3,3,2,2,2};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < arr.length ; i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
        }

        int n = arr.length ;
        List <Integer> list = new ArrayList<>() ;

        for (Integer key : map.keySet()){
           if (map.get(key) > n/3){
             list.add(key);
           }
        }

        System.out.println(list);
    }
}
