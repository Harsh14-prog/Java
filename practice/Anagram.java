// package practice;

// public class Anagram {

//     public static boolean isAnagram(String s1 , String s2){
//         int[] ishashArray = new int[26];
//         s1 = s1.toLowerCase();
//         s2 = s2.toLowerCase();

//         if(s1.length() != s2.length()) return false;

//         for(int i = 0 ; i < s1.length() ; i++){
//             ishashArray[s1.charAt(i)-'a']++;
//             ishashArray[s2.charAt(i)-'a']--;
//         }

//         for(int i = 0 ; i < ishashArray.length ; i++){
//             if(ishashArray[i] != 0){
//                 return false ;
//             }
//         }
//         return true ;
//     }
//     public static void main(String[] args) {
//         String s1 = "Anagram";
//         String s2 = "Nagara";
//         boolean ans = isAnagram(s1 , s2);
//         System.out.println(ans);
//     }
// }

package practice;

public class Anagram {

    public static boolean isAnagram(String s1 , String s2){
        // Remove all non-alphabetic characters and convert to lowercase
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // If lengths differ after cleaning, not an anagram
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] ishashArray = new int[26];

        for(int i = 0 ; i < s1.length() ; i++){
            ishashArray[s1.charAt(i)-'a']++;
            ishashArray[s2.charAt(i)-'a']--;
        }

        for(int count : ishashArray){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "Dormitory";
        String s2 = "Dirty room!";
        boolean ans = isAnagram(s1 , s2);
        System.out.println(ans); // true
    }
}

