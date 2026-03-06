package revise;

public class StringReverse {

    public static void reverse(String s , int i){

       if(i < 0) return ; 
       System.out.print(s.charAt(i)); 
       i--; 
       reverse(s , i);
    }
    public static void main(String[] args){
        String s = "harshad";
        int i = s.length()-1;
        reverse(s , i);
    }
}
