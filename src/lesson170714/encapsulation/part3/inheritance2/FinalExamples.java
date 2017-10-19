package lesson170714.encapsulation.part3.inheritance2;

public class FinalExamples {
    public static void main(String[] args) {
        int x = 10;

        process(x);
        System.out.println(x);
    }

    private static void process(int param) {
        param+=10;
    }
}
