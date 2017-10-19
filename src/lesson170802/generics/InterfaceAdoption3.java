package lesson170802.generics;

public class InterfaceAdoption3 {

    public static void main(String[] args) {
        Cleaning c = (Cleaning) new Cleaner2();
        c.clean("one");
//        c.clean(1);       Compile error

        Cleaning c2 = c;
        c2.clean(1);

        c2 = (Cleaning) new StringCleaner();
        c2.clean(1);
    }
}

interface Cleaning2<T>{
    void clean(T t);
}

class StringCleaner2 implements Cleaning2<String>{
    @Override
    public void clean(String s) {

    }
}


class Cleaner3<T> implements Cleaning2<T>{

    @Override
    public void clean(T t) {
        System.out.println("cleaning "+t);
    }
}