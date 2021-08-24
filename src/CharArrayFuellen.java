public class CharArrayFuellen {
    public static void main(String[] args) {
        System.out.println("3'tens mittels der toArray(), getChars() Methode von String/StringBuffer");
        String s = "In the computer business, soon means the same thing as manana in Spanish, but without the same kind of urgency.";
        char[] cAry;
        cAry = s.toCharArray();
        System.out.println(cAry);
        char[] cAry3 = new char[s.length()];
        System.out.println("vor: " + cAry3);
        s.getChars(10, 15, cAry3, 0);
        for(char a : cAry3) {
            System.out.print(a);
        }
        System.out.println("nach: " + cAry3);
    }
}
