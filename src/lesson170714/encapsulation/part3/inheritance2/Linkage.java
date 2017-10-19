package lesson170714.encapsulation.part3.inheritance2;

public class Linkage {
    public static void main(String[] args) {
        int[]a={1,2,3};

        int result = process(a);
    }

    private static int process(int[] a) {
        int sum = 0;
        for (int value :
                a) {
            sum += value;
        }
        return sum;
    }
}
