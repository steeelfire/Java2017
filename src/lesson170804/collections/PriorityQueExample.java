package lesson170804.collections;

import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueExample {

    private static double MAX = 1000_000;

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(0);
        pq.add(5);
        pq.add(-3);
        pq.add(40);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        Random r = new Random();
        for (int i = 0; i < MAX; i++) {
            pq.add(r.nextInt(1000_000_00));
            if (pq.size() > 10){
                pq.poll();
            }
        }
        System.out.println(pq);
    }
}
