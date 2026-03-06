package revise;

public class StringRotation {
    public static void main(String[] args) {
         String s1 = "waterbottle";
         String s2 = "erbottlewat";

         if(s1.length() != s2.length()){
            System.out.println(false);
            return;
         }

         for(int i = 0 ; i < s1.length() ; i++){
            s1 = s1.substring(1) + s1.charAt(0);
            if(s1.equals(s2)){
                System.out.println(true);
                return;
            }
         }
         System.out.println(false);
         return ;
    }
}
