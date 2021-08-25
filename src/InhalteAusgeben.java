import java.util.Arrays;

public class InhalteAusgeben {
   //Variablen
    int[] ary1 = {1, 2, 3};
    int[][] ary2 = {{4, 5, 6}, {4, 5, 6}};
    int[][][] ary3 = {{{7, 8, 9}, {7, 8, 9}, {7, 8, 9}}};


    public void A0_1() {
        System.out.println(Arrays.toString(ary1));
        System.out.println(Arrays.deepToString(ary2));
        System.out.println(Arrays.deepToString(ary3));
    }

    public void A0_2() {
        System.out.println("int[][] zeilenweise");
        for (int i = 0; i < ary2[0].length; i++) {
            for (int n = 0; n < ary2.length; n++) {
                System.out.print(ary2[n][i]);   //ich gehe rein mit der ersten Zahl von ary2[0] und nöhme die erste Zahl von beiden arrays, dann zweite, dann dritte
            }
            System.out.println();
        }
        System.out.println("int[][][] zeilenweise");
        for (int[][] x : ary3) {
            System.out.println(Arrays.deepToString(x));
            System.out.println(x.length);
            for (int y = 0; y < x[0].length; y++) {
                for (int z = 0; z < x.length; z++) {
                    System.out.print(x[z][y]);  //[y][z] spaltenweise [z][y] zeilenweise
                }
                System.out.println();
            }

        }
    }

    public void A0_3() {
        for (int i = 0; i < ary2.length; i++) {
            for (int n = 0; n < ary2[0].length; n++) {
                System.out.print(ary2[i][n]);
            }
            System.out.println();
        }
        //simpler in to string
        for (int[] i:ary2) {
            System.out.println(Arrays.toString(i));
        }
    }
    public static void main(String[] args) {
        InhalteAusgeben iha = new InhalteAusgeben();
        System.out.println("Aufgabe0-1");
        iha.A0_1();
        System.out.println("Aufgabe0-2");
        iha.A0_2();
        System.out.println("Aufgabe0-3");
        iha.A0_3();
    }

}
