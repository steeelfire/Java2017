package lesson170802.generics;

import java.util.ArrayList;
import java.util.List;

public class PREGenericsExamples {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("one");
        list.add("two");
        list.add(null);
        list.add(new PREGenericsExamples());

        for (Object ob :
                list) {
            System.out.println(ob);
        }
        List strings = new ArrayList();

        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add(1);

        for (Object obj :
                strings) {
            if (obj instanceof String) {
                String s = (String) obj;
                System.out.println(s.length());
            }
        }
    }
}
