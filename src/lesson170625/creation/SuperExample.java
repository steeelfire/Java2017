package lesson170625.creation;

public class SuperExample {
    static class A{
        public A(int i) {
        }
    }


    static class B extends A{
        public B() {
            super(10);
        }
    }
}
