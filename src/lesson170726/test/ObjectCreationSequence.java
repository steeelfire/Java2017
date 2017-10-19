package lesson170726.test;

public class ObjectCreationSequence {

    public static void main(String[] args) {
        //AA a = new AA();
        new BB();
    }
}
    class AA{
        {
            System.out.println("init A");
        }
        AA(){

            System.out.println("constructor A");
        }
    }
    class BB extends AA{
        {
            System.out.println("init B");
        }
        BB(){
            System.out.println("constructor B");
        }
    }
