package lesson170629;

public class StaticIntSequence {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        A a;

        Thread.sleep(3000);
        System.out.println(A.init());
        a=new A();
    }
}
