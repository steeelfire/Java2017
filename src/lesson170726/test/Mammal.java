package lesson170726.test;

public class Mammal {
    public Mammal(int age) {
        System.out.println("MAmmal");
    }

    public class Octopus extends Mammal{
        public Octopus() {
            super(6);
            System.out.println("Octopus");
        }
    }
        public static void main(String[] args) {
            new Mammal(5);
        }
}
