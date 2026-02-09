package Arrays;

import java.util.Arrays;

public class Combine {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {7,8,9,10,11,12,13};

        int[] c = new int[a.length + b.length];

        System.arraycopy(a , 0 , c , 0 , a.length);
        System.arraycopy(b , 0 , c , a.length , b.length);

        System.out.println(Arrays.toString(c));
    }
}
