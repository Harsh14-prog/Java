package String;

public class Anagram {

    public static boolean isAnagram (String s1 , String s2){
        
        int[] charCount = new int[256];

        if (s1.length() != s2.length()){
            return false ;
        }

        for (int i = 0 ; i < s1.length() ; i++){
           charCount[s1.charAt(i)]++;
           charCount[s2.charAt(i)]-- ;
        }

        for (int i = 0 ; i < 256 ; i++){
            if (charCount[i] != 0){
                return false ;
            }
        }
        return true ;
    }
       public static void main(String[] args) {

        String Str1 = "INTEGER" ;
        String Str2 = "NTEGERI" ;

        boolean ans = isAnagram(Str1 , Str2);
        System.out.println(ans);
    }
}
