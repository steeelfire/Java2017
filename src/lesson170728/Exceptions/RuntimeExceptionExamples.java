package lesson170728.Exceptions;

public class RuntimeExceptionExamples {
    public static void main(String[] args) {
        cast();
    }

    private static void cast() {
        Object o = "hello";
        o=new StringBuffer();
        String string = castToString(o);
        System.out.println(string);
        castToStringWithInstance(o);

    }

    private static String castToStringWithInstance(Object o) {
        return o instanceof String ? (String)o : "";
    }

    private static String castToString(Object o) {
        String s;
        try {
            s =(String) o;
        } catch (Exception e) {
            s = "";
        }
        return s;
    }


}
