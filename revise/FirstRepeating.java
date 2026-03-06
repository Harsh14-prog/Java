package revise;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeating {
    public static void main(String[] args) {

        String s = "leetcode";
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {

            if (set.contains(ch)) {
                System.out.println("First repeating: " + ch);
                return;
            }

            set.add(ch);
        }

        System.out.println("No repeating character found");
    }
}