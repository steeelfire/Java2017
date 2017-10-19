package lesson170728.Exceptions;

public class FinallyExample2 {
    public static void main(String[] args) {
        int r = get();
        System.out.println(r);
    }

    private static int get() {
        try {
            int x = 10 / 0;
            return 0;
        } catch (Exception e) {
            System.out.println("10");
        } finally {
            return 20;
        }
    }
}
