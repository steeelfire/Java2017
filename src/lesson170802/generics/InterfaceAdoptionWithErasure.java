package lesson170802.generics;

public class InterfaceAdoptionWithErasure {

    public static void main(String[] args) {
//        Cleaning<String> c = new Cleaner3<>();
//        c.clean("one");
////        c.clean(1);       Compile error
//
////        Cleaning c2 = c;
//        c2.clean(1);
//
//        c2 = (Cleaning) new StringCleaner2();
//        c2.clean(1);
    }
}

interface Cleaning<T>{
    void clean(Object t);
}

class StringCleaner implements Cleaning2<String>{
    @Override
    public void clean(String s) {

    }
}


class Cleaner2<T> implements Cleaning2<T>{

    @Override
    public void clean(T t) {
        System.out.println("cleaning "+t);
    }
}