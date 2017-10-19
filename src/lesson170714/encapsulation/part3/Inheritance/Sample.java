package lesson170714.encapsulation.part3.Inheritance;

public class Sample extends Object {
    public static void main(String[] args) {
        Class<Sample> c = Sample.class;

        Sample sample = new Sample();

        String h = "hello";
        String g = new String("hello");


        Object o = new Object();

        if (h == g) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        E e = new E();
        e.m();

        A a;
        a = new A();
        a = new B();
        a = new C();
        a = new D();
        a = new E();

        int x = (int) 10.56;

        double d = 10;
        x = (int) d;

        o = new A();
        a = (A) o;

        a = e;
        e = (E) a;
        ((E)a).m();


    }
}
