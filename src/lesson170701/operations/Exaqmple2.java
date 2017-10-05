package lesson170701.operations;

public class Exaqmple2 {

    public static void main(String[] args) {

        process("Zaal");
        process("");
        process(null);
    }

    private static void process(String s) {
        if (s!=null && s.length() > 0){
            System.out.println("Hello " + s);
        }
    }
}
