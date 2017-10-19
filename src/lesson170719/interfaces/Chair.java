package lesson170719.interfaces;

public class Chair extends Furniture {
    @Override
     public void clean() {
        System.out.println(this.getClass().getSimpleName());
    }
}
