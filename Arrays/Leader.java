package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Leader {

    public static ArrayList <Integer> leader (int arr[]){

        int maxi = Integer.MIN_VALUE ;
        ArrayList <Integer> list = new ArrayList<>();

        for (int i = arr.length - 1 ; i >= 0 ; i--){
            if (arr[i] > maxi){
                maxi = arr[i];
                list.add(maxi);
            }
        }
        return list ;
    }
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};

        ArrayList<Integer> list = leader(arr);
        
        Collections.reverse(list);  // or using 2 pointer approch
        System.out.println(list);
    }
}

