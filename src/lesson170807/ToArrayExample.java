package lesson170807;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list);
        Object array =  list.toArray();
        String[] words =  list.toArray(new String[0]);
        System.out.println(Arrays.toString(words));

        List<String> anotherList = new ArrayList<>();
        anotherList.add("four");
        anotherList.add("five");
        list.addAll(anotherList);

        System.out.println(list);

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());



    }
}
