package strings;

public class lineraSearch {

    public static int search(int arr[] , int target){
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == target){
                return i ;
            }
        }
        return -1 ;
    }

   public static void main(String[] args) {
     
    int[] arr = {1,2,3,4,5,6,7,8};
    int target = 5 ;

    int ans = search(arr , target);
    System.out.println(ans);
   } 
}
