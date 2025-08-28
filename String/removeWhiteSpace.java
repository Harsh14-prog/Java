package String;

public class removeWhiteSpace {
    public static void main(String[] args) {
        String s = "i am harshad anil   khambe";

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            if(!Character.isWhitespace(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
