package revise;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        int[] hashArr = new int[26];

        if (s1.length() != s2.length()) {
            System.out.println("not an anagram");
            return;
        }

        for(int i = 0 ; i < s1.length() ; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            hashArr[ch1 - 'a']++;
            hashArr[ch2 - 'a']--;
        }

        for(int i = 0 ; i < 26 ; i++){
            if(hashArr[i] != 0){
                System.out.println("not a anagram");
                return ;
            }
        }

        System.out.println("anagram");
    }
}
