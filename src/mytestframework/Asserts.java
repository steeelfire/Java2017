package mytestframework;

public class Asserts {
    public static boolean assertEquals(String actual, String expected) {
        //TODO
        //return actual == expected;  //Сравниваются адреса объектов, а не значения.
        boolean equals = actual.equals(expected);
        if (!equals) {
            System.err.println("Test failed: expected '" + expected + "'  actual '" + actual + "'");
        }
        return equals;
    }

    public static boolean assertNotEquals(String actual, String expected) {
        //TODO
        //return actual == expected;  //Сравниваются адреса объектов, а не значения.
        boolean notEquals = !actual.equals(expected);
        if (!notEquals) {
            System.err.println("Test failed: expected NOT '" + expected + "'  actual" + actual + "'");
        }
        return notEquals;
    }

    public static boolean assertEquals(int actual, int expected) {
        boolean equals = actual == expected;
        if (!equals) {
            System.err.println("Test failed: expected '" + expected + "'  actual'" + actual+"'");
        }
        return equals;
    }

    public static boolean assertNotEquals(int actual, int expected) {
        boolean notEquals = actual != expected;
        if (!notEquals) {
            System.err.println("Test failed: expected NOT '" + expected + "'  actual'" + actual +"'");
        }
        return notEquals;
    }
}
