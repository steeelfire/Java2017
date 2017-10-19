package lesson170707;

import mytestframework.Asserts;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String s1 = "  Hello  ";
        String s2 = "Hello";    //trimmed
        String s3 = "  Hello";
        String s4 = "Hello  ";
        String s5 = " H e l l o ";
        String s6 = "";

        System.out.println(Asserts.assertEquals(trim(s6), ""));
        System.out.println(Asserts.assertEquals(trim(s2), s2));
        System.out.println(Asserts.assertEquals(trim(s4), s2));
    }

    private static String trim(String s) {
        if (s == null || s.length()==0){
            return s;
        }
        if (s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() -1 ){//no leading and trailing spaces
            return s;
        }

        return s;
    }
}
