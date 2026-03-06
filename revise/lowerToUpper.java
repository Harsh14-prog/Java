package revise;

public class lowerToUpper {
    public static void main(String[] args) {
        String s = "harshad";
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            sb.append((char)(ch - 32));
        }

        System.out.println(sb.toString());
    }
}
