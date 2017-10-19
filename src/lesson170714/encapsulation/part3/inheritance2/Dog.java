package lesson170714.encapsulation.part3.inheritance2;

public class Dog extends Pet {

    @Override
    protected void eat() {
        System.out.println("eat fast and eager");
    }

    @Override
    protected void makesound() {
        System.out.println("bark");
    }
}
