package String;

public class longestCommonPrefix {
    public static void main(String[] args) {

        String[] str = {"flower", "flow", "flight"};

        if (str.length == 0) {
            System.out.println("");
            return;
        }

        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {
            while (!str[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    System.out.println("");
                    return;
                }
            }
        }

        System.out.println(prefix); 
    }
}
