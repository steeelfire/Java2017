package lesson170719.interfaces;

public class Table extends Furniture {
    public void clean() {
        System.out.println(this.getClass().getSimpleName());
    }
}
