package BinarySearch.Easy;

public class lowerBound {
    
   public static void main(String[] args) {
    int[] arr = {3,5,8,15,19};
    int n = arr.length ;

    int l = 0 ;
    int h = n-1 ;
    int x = 9 ;
    int ans = n ;

    while (l <= h){
       
        int mid = l + (h-1)/2 ;

        if (arr[mid] >= x ){
            ans = mid ;
            h = mid - 1 ;
        }
        else if (arr[mid] < x){
            l = mid + 1 ;
        }
    }
    System.out.println(ans);
   }
}
