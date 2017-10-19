package lesson170728.Exceptions;

import java.util.Random;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            process();
        } catch (IllegalArgumentException | ArithmeticException | NullPointerException iae) {
            System.out.println(iae.getClass().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void process() {
        Random r = new Random();
        int state = r.nextInt(4);

        switch (state) {
            case 0:
                throw new IllegalArgumentException();
            case 1:
                throw new NullPointerException();
            case 2:
                throw new ArithmeticException();
        case 3:
                throw new RuntimeException("random");
        }
    }
}
