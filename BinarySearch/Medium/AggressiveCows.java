package BinarySearch.Medium;

import java.util.Arrays;

public class AggressiveCows {

    public static boolean canWePlace(int[] stalls , int cows , int dist){

        int last = stalls[0];
        int placedCowCount = 1 ;

        for (int i = 1 ; i < stalls.length ; i++){
            if (stalls[i] - last >= dist){
                last = stalls[i];
                placedCowCount++ ;
            }
        }

        if (placedCowCount >= cows){
            return true ;
        }
        else {
            return false ;
        }
    }
    public static void main(String[] args) {

        int[] stalls = {1,2,4,8,9};
        int cows = 3 ;

        Arrays.sort(stalls);
        int n = stalls.length ;

        int l = 1 ;
        int h = stalls[n-1] - stalls[0];

        int possibelaAns = -1 ;
        
        while (l <= h){

            int mid = l + (h-l)/2 ;

            boolean ans = canWePlace(stalls , cows , mid);

            if (ans == true){
                possibelaAns = mid ;
                l = mid + 1 ;
            }
            else {
                h = mid - 1 ;
            }
        }
        System.out.println(possibelaAns);
    }
}
