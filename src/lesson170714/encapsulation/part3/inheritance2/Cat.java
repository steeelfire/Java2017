package lesson170714.encapsulation.part3.inheritance2;

public class Cat extends Pet {
    @Override
    protected void eat() {
        System.out.println("eat slowly");
    }

    @Override
    protected void makesound() {
        System.out.println("murr");
    }
}
