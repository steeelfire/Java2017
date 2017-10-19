package lesson170625.creation;

public class A {
    int i;
    long timestamp;
    {
        System.out.println("init Sample");
    }

    public A() {
        super();
        System.out.println("Constructor Sample");
        i = 10;
        timestamp = System.currentTimeMillis();
    }
    {
        System.out.println("init2 Sample");
    }
}
