package practice;

public class  firstNonRepeatingChar{
   public static void main(String[] args) {
     String s = "racecar";

     int[] hashArray = new int[26]; 

     // Step 1: Count frequency of each character
     for(int i = 0 ; i < s.length() ; i++){
        hashArray[s.charAt(i) - 'a']++;
     }

     // Step 2: Find first non-repeating char
     for(int i = 0 ; i < s.length() ; i++){
        if(hashArray[s.charAt(i)-'a'] == 1){
             System.out.println("First non-repeating char: " + s.charAt(i));
             break;
        }
     }
   } 
}

