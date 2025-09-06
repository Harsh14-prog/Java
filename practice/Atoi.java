package practice;

public class Atoi {
    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        // Step 1: Trim leading/trailing spaces
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1;
        int i = 0;
        long result = 0; // use long to detect overflow early

        // Step 2: Check sign
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // Step 4: Handle overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("   -42"));         // -42
        System.out.println(myAtoi("4193 with text")); // 4193
        System.out.println(myAtoi("words 123"));      // 0
        System.out.println(myAtoi("91283472332"));    // 2147483647 (overflow)
        System.out.println(myAtoi("+57"));            // 57
    }
}
