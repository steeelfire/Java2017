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
        }
    }

    void testARM_Java9() throws IOException {
        BufferedReader reader1 = new BufferedReader(new FileReader("journaldev.txt"));


        try (reader1) {
            System.out.println(reader1.readLine());
        }
    }
}
