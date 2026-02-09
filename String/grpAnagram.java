package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class grpAnagram {

    public static List<List<String>> groupOfAnagram(String[] s) {

        Map<String, List<String>> mp = new HashMap<>();

        for (String word : s) {

            int[] hashArray = new int[26];

            for (int i = 0; i < word.length(); i++) {
                hashArray[word.charAt(i)- 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < hashArray.length; i++) {
                sb.append(hashArray[i]).append('#');
            }

            String key = sb.toString();

            if (!mp.containsKey(key)) {
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(word);
        }
        return new ArrayList<>(mp.values());
    }

    public static void main(String[] args) {

        String[] words = {       };
        List<List<String>> ans = groupOfAnagram(words);

        System.out.println(ans);
    }
}
