package lesson170701.operations;



public class Examples {
    public static void main(String[] args) {
        Object o = new String();

        process(o);
    }

    private static void process(Object o) {
        if (o instanceof String){
            System.out.println(((String) o).length());
        }
    }
}
