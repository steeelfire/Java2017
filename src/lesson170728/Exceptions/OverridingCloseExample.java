package lesson170728.Exceptions;

public class OverridingCloseExample {

    static class MyException extends Exception{

    }
    static class A{
        public void m() throws MyException{

        }

    }
    static class B extends A{
        @Override
        public void m() throws MyException {
            super.m();
        }
    }

    static class C extends A {
        @Override
        public void m() throws MyException {
        }
    }

    public static void main(String[] args) {
        A a = new A();
        try {
            a.m();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
