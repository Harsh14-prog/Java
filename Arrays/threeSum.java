package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class threeSum {

    public static List<List<Integer>> triplets(int arr[]) {

        HashSet<List<Integer>> set = new HashSet<>();

        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.clear();  // important
            for (int j = i + 1; j < n; j++) {
                int k = -(arr[i] + arr[j]);
                if (map.containsKey(k)) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(k);
                    Collections.sort(list);
                    set.add(list);
                }
                map.put(arr[j] , j);  // storing j in map bez j is traversing , i is contt for j's iteration
            }
        }
        List <List <Integer>> newList = new ArrayList<>(set);
        return newList ;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> list = triplets(arr);

        for (List<Integer> li : list){
            System.out.println(li);
        }
    }
}
