package lesson170719;

public class PairExample {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>("one","two");
        System.out.println(pair.first + " "+pair.second);
        swap(pair);
        System.out.println(pair.first + " "+pair.second);
    }

    private static void swap(Pair pair) {
        Object tmp = pair.first;
        pair.first = pair.second;
        pair.second = tmp;
    }
}

class Pair<E>{
    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    E first;
    E second;
}
