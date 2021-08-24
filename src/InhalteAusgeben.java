import java.util.Arrays;

public class InhalteAusgeben {
    int[] ary1 = {1, 2, 3};
    int[][] ary2 = {{4, 5, 6}, {4, 5, 6}};
    int[][][] ary3 = {{{7, 8, 9}, {7, 8, 9}, {7, 8, 9}}};

    public static void main(String[] args) {
        InhalteAusgeben iha = new InhalteAusgeben();
        iha.A0_1();
        iha.A0_2();
    }

    public void A0_1() {
        System.out.println(Arrays.toString(ary1));
        System.out.println(Arrays.deepToString(ary2));
        System.out.println(Arrays.deepToString(ary3));
    }

    public void A0_2() {
        for (int[] x : ary2) {
            System.out.println(Arrays.toString(x));
        }
        for (int[][] y : ary3) {

            for (int[] z : y) {
                for (int n = 0; n < y.length;n++){
                   // System.out.println(z[n]);
                }
                System.out.println(Arrays.toString(z));
                    //System.out.println(Arrays.toString(z));
            }
        }
    }

}
