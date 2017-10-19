package lesson170726.test;

public class Hidden {
    public static void main(String[] args) {
        A a = new A();
        a.helper();

        A a2 = new B();
        A.helper();
        a2.change();

        B b = new B();
        B.helper();
    }
}
class A{

    public int x;
    private int y;

    static void helper(){
        System.out.println("helper of A");
    }

    public void change(){
        System.out.println("change of A");
    }
    protected void internal(){

    }
    private void secret(){

    }
}
class B extends A{
    public int x;   //hides

    @Override
    public void change() {
        System.out.println("Change of B");
    }

    @Override
    protected void internal() {
        super.internal();
    }

    static void helper(){
        System.out.println("Helper of B"); //hides
    }
}
