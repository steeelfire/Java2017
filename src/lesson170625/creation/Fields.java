package lesson170625.creation;

public class Fields {
    static class A {
        int i = 10;

        final long timestamp = System.currentTimeMillis();

    }

    static class B {
        int i; //0
//        final int j;    //undefied

        public void doIt(int x){

        }
        public void printIt(String x){

        }
        public void printState(){
            int x = 0;
            System.out.println(x);
        }
    }

}
