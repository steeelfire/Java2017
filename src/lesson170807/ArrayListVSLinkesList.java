package lesson170807;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVSLinkesList {
    static Random r = new Random();
    private static final int MAX = 1000_000;

    public static void main(String[] args) {
        List<Integer> arrayBased = new ArrayList<>();
        List<Integer> linkBased = new LinkedList<>();


        testFill(arrayBased);
        testFill(linkBased);

        arrayBased.clear();
        linkBased.clear();

        testFillbyInsertion(arrayBased);
        testFillbyInsertion(linkBased);

    }

    private static void testFill(List<Integer> list) {
        long start = System.nanoTime();
        fill(list);
        long finish = System.nanoTime();

        System.out.println("Elapsed: " + (finish - start));
    }
private static void testFillbyInsertion(List<Integer> list) {
        long start = System.nanoTime();
        fillbyInsertion(list);
        long finish = System.nanoTime();

        System.out.println("Elapsed: " + (finish - start));
    }


    private static void fill(List<Integer> list) {
        for (int i = 0; i < MAX; i++) {
            list.add(r.nextInt());
        }
    }

    private static void fillbyInsertion(List<Integer> list) {
        for (int i = 0; i < MAX; i++) {
            list.add(0,r.nextInt());
        }
    }
}
