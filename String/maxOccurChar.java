package String;

public class maxOccurChar {
    public static void main(String[] args) {
        String s = "programming";
        s = s.toLowerCase(); 

        int[] freq = new int[256]; 

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        int max = -1;
        char result = ' ';

        // Find character with max frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }

        System.out.println("Maximum occurring character: " + result);
    }
}

