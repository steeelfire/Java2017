package lesson170802.generics;

public class MoreGenericExamples {
    public static void main(String[] args) {
        Example.staticMethod("one");
        Example.staticMethod(1);
        Example.staticMethod(new Object());

        Example<String> ex = new Example();
        Example<Integer> ex2 = new Example();

        ex.staticMethod("one");
        ex.staticMethod(1);
        ex.staticMethod(MoreGenericExamples.class);

        Example.staticMethod(ex);
        Example.staticMethod(ex2);

        new Example<>().Method("one");
        try {
            System.out.println(1);
        } finally {
         throw new RuntimeException();
        }

    }
}

class Example<T>{

//    static T x;       ERROR!
    public static <M> void staticMethod(M m){
        System.out.println(m.getClass().getTypeName());
    }

    public <N> void Method(N m){
        System.out.println(m);
    }
}
