package lesson170719.interfaces;

public class Drum extends Istrument {
    public void clean() {
        System.out.println(this.getClass().getSimpleName());
    }
}
