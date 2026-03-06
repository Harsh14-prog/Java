package revise;

public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        int n = s.length();

        int l = 0 ;
        int h = n-1 ;

        while(l < h){
            if(s.charAt(l) != s.charAt(h)){
               System.out.println("string is not palindrome");
               return ;
            }
            l++;
            h--;
        }
        System.out.println("string is palindrome");
    }
}
