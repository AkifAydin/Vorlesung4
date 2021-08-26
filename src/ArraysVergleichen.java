import java.awt.*;
import java.util.Arrays;

public class ArraysVergleichen {
    public static void main(String[] args) {

        int[][] ary1 = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int[][] ary2 = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        int[] ary3 = {1,2,3,4,5};
        int[] ary4 = {1,2,3,4,5};
        Integer[] arys1 = {1,4,3,2,5};

        Integer[] arys2 = {1,4,3,2,5};

        System.out.println(ary1==ary2);
        System.out.println(ary3.equals(ary4));
        System.out.println(Arrays.equals(ary3,ary4));
        System.out.println(Arrays.deepEquals(ary1,ary2));
        System.out.println(ary3[1] == ary4[1]);

        Arrays.sort(arys1);
        Arrays.sort(arys2);
        System.out.println(ary1);
        System.out.println(ary2.toString());
        System.out.println(Arrays.toString(arys1));
        System.out.println(Arrays.toString(arys2));

        //System.out.println(Arrays.compare(ary1, ary2)); //muss generischer Typ sein
        System.out.println(Arrays.compare(arys1, arys2));

    }
}
