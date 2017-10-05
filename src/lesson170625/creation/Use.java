package lesson170625.creation;

public class Use {
    public static void main(String[] args) {
//        A a = new A();
//
//        System.out.println(a);

        B b = new B();

        C c = new C();
        c.C();
        Singleton.get();

        new Z();
        new Z();

        WholePicture.A a = new WholePicture.A();
    }
}
