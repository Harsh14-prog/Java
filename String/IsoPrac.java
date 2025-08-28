package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsoPrac {

    public static boolean isomorphic(String s1 , String s2){

        if (s1.length() != s2.length()) return false;
        Map <Character , Character> mp = new HashMap<>();
        Set <Character> used = new HashSet<>();

        for(int i = 0 ; i < s1.length() ; i++){

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            if (mp.containsKey(c1)){
                if(mp.get(c1) != c2){
                    return false ;
                }
            }
            else{
                // have to do mapping
                if(used.contains(c2)){
                    return false ;
                }
                mp.put(c1,c2);
                used.add(c2);
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        String s1 = "paper";
        String s2 = "title";

        boolean ans = isomorphic(s1 , s2);
        System.out.println(ans);
    }
}
