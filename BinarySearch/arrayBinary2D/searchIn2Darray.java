package BinarySearch.arrayBinary2D;

import java.util.ArrayList;
import java.util.Arrays;

public class searchIn2Darray {

    public static ArrayList <Integer> search(ArrayList <ArrayList <Integer>> matrix , int target){
        
        int rowSize = matrix.size();
        int colSize = matrix.get(0).size();

        int l = 0;
        int h = rowSize * colSize - 1;

        ArrayList <Integer> list = new ArrayList<>();

        while (l <= h){

            int mid = l + (h-l)/2 ;

            int row = mid / colSize ;
            int col = mid % colSize ;

            if (matrix.get(row).get(col) == target){
                list.add(row);
                list.add(col);
                return list ;
            }
            else if (matrix.get(row).get(col) > target) {
                h = mid - 1 ;
            }
            else {
                l = mid + 1 ;
            }
        }
        return new ArrayList<>(Arrays.asList(-1,-1)) ;

    }
    public static void main(String[] args) {

        ArrayList <ArrayList <Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(3,4,7,9)));
        matrix.add(new ArrayList<>(Arrays.asList(12,13,16,18)));
        matrix.add(new ArrayList<>(Arrays.asList(20,21,23,29)));

        int target = 23 ;

        ArrayList <Integer> ans = search(matrix , target);
        System.out.println(ans);
    }
}
