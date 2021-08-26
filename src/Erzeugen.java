import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Erzeugen {

    public static int[][] A1(int n, int k, int max) {
        Random rd = new Random();
        int[][] iAry = new int[n][];
        for (int zi = 0; zi < n; zi++) {
            int laenge = rd.nextInt(k) + 1; // min 0 max k-1 [1..k]
            int[] zAry = new int[laenge];
            for (int si = 0; si < zAry.length; si++) {
                int value = rd.nextInt(2 * max + 1) - max;
                zAry[si] = value;
            }
            iAry[zi] = zAry;
        }
        return iAry;
    }

    public static void A2(int n) {
        int[] ary1n = new int[n];
        for (int i = 0; i < n; i++) {
            ary1n[i] = i + 1;
        }
        Random rd = new Random();
        //int[][] ary2D = new int[n][ary1n.length];
        int[][] ary2D = new int[n][];
        for (int zi = 0; zi < n; zi++) {
            ary2D[zi] = ary1n.clone();
        }
        System.out.println(Arrays.deepToString(ary2D));

    }

    public static String[][][] A3(int n) {
        String[][][] ary = new String[n][n][n];
        for (int x = 0; x < ary.length; x++) {
            for (int y = 0; y < ary.length; y++) {
                for (int z = 0; z < ary.length; z++) {
                    ary[x][y][z] = "<" + x + "," + y + "," + z + ">";
                }
            }
        }
        return ary;
    }

    public static short[][] A4(int n, int m) {
        short[][] ary = new short[n][m];
        Random ran = new Random();
        for (short[] a : ary) {
            for (int z = 0; z < a.length; z++) {
                a[z] = (short) (ran.nextInt(Short.MAX_VALUE - Short.MIN_VALUE) + Short.MIN_VALUE);
                if (!inShort(a[z])) {
                    throw new IllegalArgumentException("not a short " + a[z]);
                }
            }
        }
        return ary;
    }

    public static boolean inShort(int value) {
        return value >= Short.MIN_VALUE && value <= Short.MAX_VALUE;
    }

    public static int[] A5(int n) {
        int[] ary = new int[n];
        int[] ary2 = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = i;
        }
        for (int x = 0; x < n; x++) {
            ary2[x] = ary[n - 1 - x];
        }
        ary = ary2;
        return ary;
    }

    public static int[][] A6(int n, int m) {
        int[][] ary = new int[n][m];
        int count = 0;
        for (int[] i : ary) {
            for (int x = 0; x < i.length; x++) {
                i[x] = count;
                count++;
            }
        }
        return ary;
    }

    public static List<Integer> A7(int[][] ls) {
        List<Integer> list = new ArrayList<Integer>();
        for (int[] i : ls) {
            for (int x = 0; x < i.length; x++) {
                list.add(x, i[i.length - 1 - x]);
            }
        }
        return list;
    }

    public static List<Integer> A9(String[][][] ary) {
        List<Integer> list = new ArrayList<Integer>();
        for (String[][] x : ary) {
            for (String[] y : x) {
                for (int i = 0; i < y.length; i++) {
                    list.add(Integer.getInteger(y[i]));
                }
            }
        }
        return list;
    }

    public static void A10(int[] ary) {
        System.out.println(Arrays.toString(ary));
        for (int i = 0; i < ary.length; i++) {

            if (i == ary.length / 2) break;
            System.out.println(ary[i] + " <-> " + ary[ary.length - i - 1]);
        }
    }

    public static String[][][] A11(String[][][] ary) {
        return ary.clone();
    }

    public static String[][][] A12(String[][][] ary) {
        String[][][] tiefeKopie = new String[ary.length][][];
        for (int i = 0; i < ary.length; i++) {
            String[][] kopie2D = new String[ary[i].length][];
            for (int j = 0; j < ary[i].length; j++) {
                kopie2D[j] = ary[i][j].clone();
            }
            tiefeKopie[i] = kopie2D;
        }
        return tiefeKopie;
    }

    public static int[][] A13(int[][] ary) {
        int[][] newary = new int[ary.length][];
        for (int y = 0; y < ary.length; y++) {
            newary[y] = Arrays.copyOf(ary[y], (ary[y].length) / 2);
        }
        return newary;
    }

    public static int[][] A14(int[][] ary) {
        int[][] newary = new int[ary.length][];
        for (int x = 0; x < ary.length; x++) {
            newary[x] = Arrays.copyOfRange(ary[x], ary.length / 2, ary.length);
        }
        return newary;
    }

    //1.  nur ungerade Arrays möglich
    //2. kompletters ary1 muss in der MITTE von ary2 sein
    //3. ausgabe true/false
    //prüft ob ary1 kern von ary2 in der mitte
    public static boolean A16(int[] ary1, int[] ary2) {
        if (ary1.length != ary2.length - 2) return false;
        for (int i = 0; i < ary1.length; i++) {
            if (ary1[i] != ary2[i + 1]) return false;
        }
        return true;
    }

    public static boolean A17(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            if (!(ary[i] == ary[ary.length - 1 - i])) return false;

        }
        return true;
    }

    public static boolean A18(int[][] ary) {
        for (int i = 0; i < ary.length / 2; i++) {
            if (!Arrays.equals(ary[i], ary[ary.length - 1 - i])) return false;
        }
        return true;
    }

    public static boolean A19(int[][][] ary) {
        for (int[][] n : ary) {

            for (int i = 0; i < n.length / 2; i++) {
                if (!Arrays.equals(n[i], n[n.length - 1 - i])) return false;
            }
        }
        return true;
    }

    public static boolean A20(int[][] ary) {
        for (int i = 0; i < ary.length / 2; i++) {

            if (!(ary[i].length == ary[ary.length - i - 1].length) && ary[i].length > ary[i + 1].length) return false;
        }
        return true;
    }

    public static int[] A22(int[] ary) {
        List<Integer> newlist = new ArrayList<Integer>();
        for (int i = ary.length - 1; i >= 0; i--) {
            for (int y = ary.length - 1; y >= 0; y--) {
                if (i == y) {
                    continue;
                }
                if (ary[i] == ary[y]) {
                    break;
                } else {
                    if (y == 0) {
                        newlist.add(ary[i]);
                    }
                }
            }    //[1,6,7,9,10,11,12]
            //System.out.println(ary[i]);
        }
        int[] newary = new int[newlist.size()];
        for (int z = 0; z < newlist.size(); z++) {
            newary[z] = newlist.get(z);
        }
        return newary;
    }

        //public static boolean

    public static void main(String[] args) {
        //A1(5, 10);
        System.out.println("Aufgabe.1");
        int[][] a1 = A1(2, 2, 5);
        System.out.println(Arrays.deepToString(a1));
        System.out.println("Aufgabe.2");
        A2(10);
        System.out.println("Aufgabe.3");
        System.out.println(Arrays.deepToString(A3(2)));
        String[][][] a3 = A3(2);
        System.out.println("Aufgabe.4");
        System.out.println(Arrays.deepToString(A4(2, 5)));
        //System.out.println(inShort(-32769));
        System.out.println("Aufgabe.5");
        System.out.println(Arrays.toString(A5(5)));
        int[] a5 = A5(5);
        System.out.println("Aufgabe.6");
        System.out.println(Arrays.deepToString(A6(2, 3)));
        int[][] a = A6(2, 3);
        System.out.println("Aufgabe.7");
        System.out.println(A7(a));
        System.out.println("Aufgabe.9");
        System.out.println(A9(a3));
        System.out.println("Aufgabe.10");
        A10(a5);
        System.out.println("Aufgabe.11");
        System.out.println(Arrays.deepToString(A11(a3)));
        System.out.println("Aufgabe.12");
        System.out.println(Arrays.deepToString(A12(a3)));
        System.out.println("Aufgabe.13");
        System.out.println(Arrays.deepToString(A13(a1)));
        System.out.println("Aufgabe.14");
        System.out.println(Arrays.deepToString(A14(a1)));
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {0, 1, 2, 3, 5, 6};
        int[] arr3 = {1, 2, 3, 2, 1};
        int[][] arr4 = {{1, 2, 3, 2, 1}, {1, 2, 3}, {0, 1, 2, 3, 5, 6}, {1, 2, 3}, {1, 2, 3, 2, 1}};
        int[][][] arr5 = {{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}}};
        int[][] arr6 = {{3, 2, 1, 2, 3}, {2, 1, 2}, {1}, {2, 1, 2}, {3, 2, 1, 2, 3}};
        int[][][] arr8 = {{{3, 2, 1, 2, 3}, {2, 1, 2}, {1}, {2, 1, 2}, {3, 2, 1, 2, 3}}};
        int[] arr7 = {2, 1, 2, 3, 5, 6, 7, 8, 8, 9, 3, 10, 11, 12, 5}; //[1,6,7,9,10,11,12]

        System.out.println("Aufgabe.16");
        System.out.println(A16(arr1, arr2));
        System.out.println("Aufgabe.17");
        System.out.println(A17(arr3));
        System.out.println("Aufgabe.18");
        System.out.println(A18(arr4));
        System.out.println("Aufgabe.19");
        System.out.println(A19(arr5));
        System.out.println("Aufgabe.20");
        System.out.println(A20(arr6));
        System.out.println("Aufgabe.22");
        System.out.println(Arrays.toString(A22(arr7)));
        //String str = args[0];
        //System.out.println("str: " +str);
    }
}
