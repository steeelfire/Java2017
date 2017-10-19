package lesson170724;

public class Anonymous {

    interface Operation{
        abstract int apply(int a, int b);
    }
    static class Addition implements Operation{

        @Override
        public int apply(int a, int b) {
            return a*b;
        }
    }
    static class Multiplication implements Operation{

        @Override
        public int apply(int a, int b) {
            return a+b;
        }
    }

    public static void main(String[] args) {
        int result = process(new Addition(), 10,20);
        System.out.println(result);
        int result2 = process(new Multiplication(), 10,20);
        System.out.println(result);

        int result3 = process(new Operation() {
            @Override
            public int apply(int a, int b) {
                return a/b;
            }
        }, 10, 20);

        int result5 = process(new Operation() {
            @Override
            public int apply(int a, int b) {
                return a%b;
            }
        }, 10, 20);


        class Substract implements Operation{

            @Override
            public int apply(int a, int b) {
                return a-b;
            }
        }

        result = process(new Substract(),40,10);


        int result4 = process((a,b) ->  a/b , 10, 20);
    }

    private static int process(Operation op, int i, int j) {
        return op.apply(i,j);
    }
}
