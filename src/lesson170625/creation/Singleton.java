package lesson170625.creation;

public class Singleton {

    static private Singleton instance = new Singleton();
    private Singleton() { }

    public static Singleton get(){
        return instance;
    }
    public void doIt(){
        System.out.println("did it");
    }
}
