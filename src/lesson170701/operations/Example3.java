package lesson170701.operations;

public class Example3 {

    short x =10;
    short y = 3;

    short z = (short)(x*y);

    public static void main(String[] args) {
        System.out.println(method(""));
    }

    private static String method(String str) {
        if (str == null) {
            return null;
        }
        char ch = ' ';
        String tmp = "";
        ch = str.charAt(str.length()-1);
        tmp = ch + str + ch;
        return tmp;
    }
}
