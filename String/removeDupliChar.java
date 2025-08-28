package String;

public class removeDupliChar {
    public static void main(String[] args) {
        String s = "racecar";

        boolean[] isVisited = new boolean[26];

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
           if(isVisited[s.charAt(i) - 'a'] == false){
              sb = sb.append(s.charAt(i));
              isVisited[s.charAt(i)-'a'] = true ;
           }
        }

        System.out.println(sb.toString());
    }
}
