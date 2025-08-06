package BinarySearch.Medium;

public class NthRoot {

  public static long nthroot(int mid , int m){
    long ans = 1 ;
    for (int i = 0 ; i < m ; i++){
       ans = ans * mid ;
    }
    return ans ;
  }  
  public static void main(String[] args) {

    int n = 28;
    int m = 3 ;

    int l = 1 ;
    int h = n ;
    int ans = -1 ;

    while (l <= h){

        int mid = l + (h - l)/2 ;
        long rootAns = nthroot(mid , m) ;

        if (rootAns > n){
            h = mid - 1 ;
        }
        else if (rootAns <= n){
           ans = mid ;
           l = mid + 1 ;
        }
    }
    System.out.println(ans);

  } 
}
