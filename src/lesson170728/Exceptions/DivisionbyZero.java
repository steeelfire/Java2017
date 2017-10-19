package lesson170728.Exceptions;

public class DivisionbyZero {
    public static void main(String[] args) {
        int result = divide(10,0);
        System.out.println(result);
    }

    private static int divide(int i, int i1) {

        try {
            return i/i1;
        } catch (Exception e) {
            return Integer.MAX_VALUE;
        }
    }
}
