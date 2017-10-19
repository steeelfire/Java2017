package lesson170714.encapsulation.part3.inheritance2;

public class Rat extends Rodent {
    @Override
    protected void eat() {
        System.out.println("grab and run");
        makesound();
        super.makesound();
    }

    @Override
    protected void makesound() {
        teethClac();
        super.makesound();
//        super.super.makeSound();
        teethClac();
    }

    private void teethClac() {
        System.out.println("clac - clac");
    }
}
