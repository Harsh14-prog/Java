package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void swap(int arr[] , int l , int h){
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp ;
    }
    public static void main(String[] args) {

        int[] arr = {13,46,24,52,20,9};
        for (int i = 0 ; i < arr.length-1 ; i++){
            boolean isSwapped = false ;
            for (int j = 0 ; j < arr.length- i - 1 ; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr , j , j+1);
                    isSwapped = true ;
                }
            }
            if (!isSwapped){   // after 1st pass not even 1 swap done so array already sorted , break next passes
                break ;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
