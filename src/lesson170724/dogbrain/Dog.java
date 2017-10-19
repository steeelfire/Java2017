package lesson170724.dogbrain;

public class Dog implements Pet {
    Brain brain = this.new Hungry();

    private class Hungry implements Brain{

        @Override
        public void feed() {
            bark();
            wiggle();
            eat();
            bark();
            brain = Dog.this.new Fed();
        }



        @Override
        public void play() {
            bark();
            bite();
            bark();
        }
    }

    private class Fed implements Brain{

        @Override
        public void feed() {
            wiggle();
            wiggle();
        }

        @Override
        public void play() {
            bark();
            wiggle();
            jump();
            jump();
            brain = new Hungry();
        }
    }

    private void jump() {
        System.out.println("jumping");
    }

    private void bite() {
        System.out.println("bites");
    }

    private void eat() {
        System.out.println("eats");
    }

    private void wiggle() {
        System.out.println("wiggle");
    }

    private void bark() {
        System.out.println("bark");
    }

    @Override
    public void feed(){
        brain.feed();
    }
    @Override
    public void play(){
        brain.play();
    }
}
