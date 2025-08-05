package String;

public class RotateString {
    public static void main(String[] args) {

        String s = "abcde";
        String target = "cdeab";

        if (s.length() != target.length()){
            System.out.println("false");
        }
        
        if ((s + s).contains(target)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
