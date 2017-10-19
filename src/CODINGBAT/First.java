package CODINGBAT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class First {
    public static void main(String[] args) {
        String str = "hi there";

        String tmp = str.substring(0, 2);
        System.out.println(tmp);
        if (tmp.equals("hi")) {
            System.out.println("true");
        } else {
            System.out.println("false");
//            ((small + big*5)==goal) || big*5==goal ||
            System.out.println("Deutche: " + method1(5,4));
        }

        String str2 = "cekdelfrvk";
        String helloWorld = "adelHello World!";
        String he = helloWorld.substring(1,4);
        System.out.println(he);

//        str2.charAt()
        if (he.equals("del") && he.length() >4){
            System.out.println(helloWorld.replace("del",""));
        }
    }

    private static String rem(String str2) {

        return str2;
    }

    void testARM_Java9() throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));


        try (reader1) {
            System.out.println(reader1.readLine());
        }
    }

    public static int method1 (int a, int n) {
        int p = 0;
        if (n == 0) {
            p = 1;
        } else if (n % 2 == 0) {
//'%' in Java - modulus operator
            p = method1(a, n / 2) * method1(a, n / 2);
        } else {
            p = method1(a, n - 1) * a;
        }
        return p;
    }

}
