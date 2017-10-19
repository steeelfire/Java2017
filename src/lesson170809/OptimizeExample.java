package lesson170809;

public class OptimizeExample {
    public static void main(String[] args) {
        int y = 0;
        long start = System.nanoTime();
        for (long i = 0; i < 1_000_000_000_000_000L; i++) {
            y = 0;
        }
        long stop = System.nanoTime();
        System.out.println("elapsed= " + (stop-start));
    }
}
