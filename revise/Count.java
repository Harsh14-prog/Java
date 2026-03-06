package revise;

public class Count {
    public static void main(String[] args) {
        String s = "Harshad 123 is Learning Java";
        int vowel = 0;
        int consonant = 0;
        int digit = 0;
        int space = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
            else if(ch >= '0' && ch <= '9'){
                digit++;
            }
            else if(ch == ' '){
                space++;
            }

        }

        System.out.println("vowels : " + vowel);
        System.out.println("consonants : " + consonant);
        System.out.println("digits : " + digit);
        System.out.println("spaces: " + space);
    }
}
