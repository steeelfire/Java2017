package lesson170714.encapsulation.part3.inheritance2;

public abstract class Pet extends Mammal{
    public void feed(){
        makesound();
        eat();
        makesound();
    }

    protected abstract void eat();

    protected void makesound(){
        System.out.println("hhhhhhhhhhhh");
    }
}
