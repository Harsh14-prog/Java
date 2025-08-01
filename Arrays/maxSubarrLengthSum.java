package Arrays;
import java.util.HashMap;


public class maxSubarrLengthSum {
    
    public static int maxLength(int arr[] , int k){
       
        HashMap<Integer , Integer> map = new HashMap<>();

        int sum = 0 ;
        int length = 0 ;

        for (int i = 0 ; i < arr.length ; i++){

            sum = sum + arr[i];

            if (sum == k){
              length = i+1 ;
            }

            if (map.containsKey(sum-k)){
                length = Math.max(length , i-(map.get(sum-k)));
            }

            if (!map.containsKey(sum)){
                map.put(sum , i);
            }
        }
        return length ;
    
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int k = 10 ;

        int ans = maxLength(arr , k);
        System.out.println(ans);
    }
}




// package Arrays;

// public class maxSubarrLengthSum {
    
//     public static int maxLength(int arr[] , int k){

//         int maxi = 0 ;

//         for (int i = 0 ; i < arr.length ; i++){
//             int sum = 0 ;
//             for (int j = i ; j < arr.length ; j++){
//                sum = sum + arr[j];

//                if (sum == k){
//                 maxi = Math.max(maxi, j-i+1);
//                }
//             }
//         }
//         return maxi ;
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,3,5,1,9};
//         int k = 10 ;

//         int ans = maxLength(arr , k);
//         System.out.println(ans);
//     }
// }
