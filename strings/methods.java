package strings;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String s1 = "harshad khambe";
        char[] arrayOfChar = s1.toCharArray();

        System.out.println(Arrays.toString(arrayOfChar));

        String s = s1.toLowerCase();
        System.out.println(s);

        System.out.println(s1);
    }
}
