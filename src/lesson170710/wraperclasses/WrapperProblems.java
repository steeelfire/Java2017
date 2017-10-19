package lesson170710.wraperclasses;

import java.util.ArrayList;
import java.util.List;

public class WrapperProblems {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        List<int > list = new ArrayList<>();

        list.add(1);
        list.add(0);
        list.add(0);    //list.new Integer()
        list.add(null);
        int x = list.remove(0);

    }
}
