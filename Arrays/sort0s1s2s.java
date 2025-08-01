package Arrays;

public class sort0s1s2s {

    public static void swap(int arr[] , int l , int h) {
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp ;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};

        int low = 0 ;
        int mid = 0 ;
        int high = arr.length-1 ;

        while (mid < high){
            if (arr[mid] == 0){
                swap(arr , mid , low);
                mid++ ;
            }

            else if (arr[mid] == 1){
                mid++ ;
            }

            else if (arr[mid] == 2){
                swap(arr , mid , high);
                high-- ;
            }
        }

        for (int ele : arr){
            System.out.println(ele);
        }
    }
}
