package lesson170714.encapsulation.part3.other;

import lesson170714.encapsulation.part3.A;

public class Heir extends A {
    public static void main(String[] args) {
        A a = new A();
//        a.m1();
//        a.m2();
//        a.m3();
        a.m4();

        Heir heir = new Heir();
//        heir.m1();
//        heir.m2();
        heir.m3();
        heir.m4();
    }
}
