package String;

public class longestPalindromicsubstr {

    public static boolean isPalindrome(String s) {
        int l = 0;
        int h = s.length() - 1;

        while (l < h) {
            if (s.charAt(l) != s.charAt(h)) {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "babad";
        int maxi = 0;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    int length = sub.length();
                    if (length > maxi) {
                        maxi = length;
                        ans = sub; 
                    }
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + ans);
        System.out.println("Length: " + maxi);
    }
}
