package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9} ;
        
        for (int i = 0 ; i < arr.length ; i++){
           int miniIndex = i ;
           for (int j = i ; j < arr.length ; j++){
              if (arr[j] < arr[miniIndex]){
                 miniIndex = j ;
              }
           }

           int temp = arr[i];
           arr[i] = arr[miniIndex];
           arr[miniIndex] = temp ;
        }

        System.out.println(Arrays.toString(arr));
    }
}
