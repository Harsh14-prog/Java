package String;

public class Atoi {
    public static void main(String[] args) {
        String s = "-123";

        int sign = 1 ;
        int i = 0 ;

        if (s.charAt(i) == '-'){
            sign = -1 ;
            i = 1 ;
        }
        else{
            i = 0 ;
        }
        
        int result = 0 ;
        for( ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
               result = result * 10 + (s.charAt(i) - '0');
            }
            else{
                break ;
            }
        }

        System.out.println(result*sign);
    }
}
