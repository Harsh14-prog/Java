package BinarySearch.arrayBinary2D;

import java.util.ArrayList;
import java.util.Arrays;

public class RowWithMax1s {

    public static int lowerBound(ArrayList <Integer> arr , int x){

        int l = 0 ;
        int n = arr.size();
        int h = n-1 ;
        int ans = n ;

        while (l <= h){
            int mid = l + (h-l)/2 ;

            if (arr.get(mid) >= x){
               ans = mid ;
               h = mid - 1 ;
            }
            else {
                l = mid + 1 ;
            } 
        }
        return ans ;
    }
    public static void main(String[] args) {

        ArrayList <ArrayList <Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0,0,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,0,1)));


        int rowSize = matrix.size();
        int colSize = matrix.get(0).size();

        int maxi = Integer.MIN_VALUE ;
        int index = -1 ;

        for (int i = 0 ; i < rowSize ; i++){

            int row1Count = colSize - lowerBound(matrix.get(i) , 1);
            
            if (row1Count > maxi){
                maxi = row1Count ;
                index = i ;
            }
        }
        System.out.println(index);
    }
}
