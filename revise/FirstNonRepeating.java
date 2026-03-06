package revise;

public class FirstNonRepeating {
    public static void main(String[] args) {

        String s = "loveleetcode";
        int[] hashArr = new int[26];

        // Step 1: Count frequency
        for (int i = 0; i < s.length(); i++) {
            hashArr[s.charAt(i) - 'a']++;
        }

        // Step 2: Traverse original string to preserve order
        for (int i = 0; i < s.length(); i++) {
            if (hashArr[s.charAt(i) - 'a'] == 1) {
                System.out.println(s.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}