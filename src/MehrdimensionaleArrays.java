import java.util.*;

public class MehrdimensionaleArrays {

    public static void einsZweiDimensional() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] d : matrix1) {
            //System.out.println(d);
            for (int x : d) {
                System.out.print(x);
            }
            System.out.print(",");
        }
    }

    public static int[][] zeilenweiseDurchlaufenUndFuellen(){
        int[] sevenInts = {1,2,3,4,5,6,7};
        int[][] matrix1 = new int[4][7] ;
        for (int i = 0; i < matrix1.length; i++) {
            matrix1[i] = sevenInts.clone(); // Kopien, um Seiteneffekte zu unterbinden
            //System.out.println(matrix1[i].toString());
            //return matrix1[i];
        }
        return matrix1;
    }

    public static void arraycopy() {
        int[] ary1 = {1,2,3,4,5};
        int[] ary2 = new int[ary1.length];

        System.arraycopy(ary1,0,ary2,0,ary1.length);
        for (int x : ary2) {
            System.out.print(x);
        }
    }

    public static void main(String[] args) {
        MehrdimensionaleArrays mehr = new MehrdimensionaleArrays();
        //List<Integer> in = new ArrayList<Integer>();
        //Map<Integer> mp = new ArrayList<Integer>();
        einsZweiDimensional();
        System.out.println(zeilenweiseDurchlaufenUndFuellen());
        //System.out.println(a3(3).toString());
        System.out.println("Arraycopy!");
        arraycopy();
    }
}
