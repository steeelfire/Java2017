package lesson170726.test;

public class Frog implements CanHop {
    public static void main(String[] args) {
       TurtleFrog frog = new TurtleFrog();
       CanHop frog2 = new TurtleFrog();
    }
}

class BrazilianHornedFrog extends Frog{}

class TurtleFrog extends Frog{}