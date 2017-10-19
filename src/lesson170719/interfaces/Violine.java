package lesson170719.interfaces;

public class Violine extends Istrument {
    public void clean() {
        System.out.println(this.getClass().getSimpleName());
    }
}
