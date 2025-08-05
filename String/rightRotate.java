package String;

public class rightRotate {
    
    public static void main(String[] args) {

        String s = "abcdef";
        int k = 2 ;

        System.out.println(s.substring(s.length()-k) + s.substring(0 , s.length()-k));
    }
}
