package lesson170804.collections;

import java.util.*;

public class DataStructuresInJava {

    public static void main(String[] args) {
    int x = 0;
    String s = "Hello";
    int a[] = new int [10];

    Object[] _objects = new Object[0];
    Stack<String> stack = new Stack<>();

    stack.push("one");

        List<Number> list = Arrays.asList(1,1.3,0b001);
        List<Number> linkedlist = new LinkedList<>(){{
           add(1);
           add(1.3);
           add(0b001);
        }};

        List<Number> linkedlist2 = new LinkedList<>();
        linkedlist2.add(1);
        linkedlist2.add(1.3);
        linkedlist2.add(0b001);

        Queue<String> queue = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Map<String,Integer> wordCount = new HashMap<>();

        fill(wordCount);

        Map<String,Integer> wordCount2 = new LinkedHashMap<>();
        Map<String,Integer> wordCount3 = new TreeMap<>();
    }

    private static void fill(Map<String, Integer> wordcount) {
        List<String> words = Arrays.asList("one","two","three","one","two");

        for (String word :
                words) {
            Integer count = wordcount.get(word);
            wordcount.put(word, count == null ? Integer.valueOf(1) : ++count);
        }
        System.out.println(wordcount);
    }

}
