package BinarySearch.Medium;

import java.util.Arrays;

public class bookAllocation {

    public static boolean isAllocate(int books[] , int pages , int students){

        int bookPages = 0 ;
        int studentCount = 1 ;

        for (int i = 0 ; i < books.length ; i++){

            if (books[i] > pages){
                return false ;
            }
            if (bookPages + books[i] <= pages){
                bookPages = bookPages + books[i];
            }
            else {
                studentCount++ ;
                bookPages = books[i];
            }
        }
        if (studentCount <= students){
            return true ;
        }
        else {
            return false ;
        }
    }
    public static void main(String[] args) {

        int[] books = {12, 34, 67, 90};
        int students = 2 ;

        int n = books.length ;

        int l = Arrays.stream(books).max().getAsInt();  // for 1st if condn , 1 student should get 1 whole book
        int h = Arrays.stream(books).sum();

        int ans = -1 ;

        while (l <= h){

            int mid = l + (h-l)/2 ;

            boolean ans1 = isAllocate(books , mid , students);

            if (ans1 == true){
              ans = mid ;
              h = mid - 1 ;
            }
            else {
                l = mid + 1 ;
            }
        }
        System.out.println(ans);
    }
    
}
