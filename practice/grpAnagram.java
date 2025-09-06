package practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class grpAnagram {

    public static List<List<String>> groupOfAnagram(String[] words){

        Map <String , List<String>> mp = new HashMap<>();
       
        for(String str : words){
           
            int[] hashArray = new int[26];

            for(int i = 0 ; i < str.length() ; i++){
                char ch = str.charAt(i);
                hashArray[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < hashArray.length ; i++){
                sb.append(hashArray[i]).append('#');
            }

            String key = sb.toString();

            if(!mp.containsKey(key)){
                mp.put(key , new ArrayList<>());
            }
            mp.get(key).add(str);
        }
        
        List <List<String>> list = new ArrayList<>();

        for(List<String> li : mp.values()){
            list.add(li);
        }

        return list ;
    }
    public static void main(String[] args) {
        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> ans =  groupOfAnagram(words);

        System.out.println(ans);
    }
}
