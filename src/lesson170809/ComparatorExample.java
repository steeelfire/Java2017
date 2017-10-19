package lesson170809;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<B> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new B());
        }
        Collections.sort(list, new ComparatorB());
    }
}
class B  {
    static Random r = new Random();
    int x=r.nextInt(100);

    @Override
    public String toString() {
        return Integer.toString(x);
    }
}




