package String;

public class countConsonantAndVowel {
    public static void main(String[] args) {

        String s = "Hello I am Harshad 123!";
        String lowerString = s.toLowerCase();

        int vowel = 0 ;
        int consonant = 0 ;

        char[] chArr = lowerString.toCharArray();

        String vowelString = "aeiou";

        for(int i = 0 ; i < chArr.length ; i++){
            char ch = chArr[i];
           if(Character.isLetter(ch)){
              if(vowelString.contains(String.valueOf(ch))){
                 vowel++;
              }
              else{
                consonant++;
              }
           } 
        }   
        System.out.println("vowel : " + vowel + " " + "consonant : " + " "+ consonant );
    }
}
