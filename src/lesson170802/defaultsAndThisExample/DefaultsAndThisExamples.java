package lesson170802.defaultsAndThisExample;

public class DefaultsAndThisExamples {
    public static void main(String[] args) {
            X x = new A();
            x.a();
    }
}

interface X{
    void a();
    void b();

    default void process(){
        this.a();
        System.out.println(this);

    }
}
class A implements X{

    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }
}
