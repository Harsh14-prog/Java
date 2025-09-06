package practice;

public class countVowelandConsonant {
    public static void main(String[] args) {
        String s = "Hello I am Harshad 123!";
        s = s.toLowerCase();

        int vowel = 0;
        int consonant = 0;
        int digit = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                // check vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digit++;   // count digits
            } else if (ch != ' ') {
                special++; // count everything else except space
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
        System.out.println("Digits: " + digit);
        System.out.println("Special Characters: " + special);
    }
}
