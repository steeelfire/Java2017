package lesson170701.operations;

public class GuardConditions {

    public static void main(String[] args) {


        String string = "";
        string.charAt(string.length()-1);

    }

    private static void m(int i) {
//        if (i>0){
//            if (i%2==0){
//                if (i<100){
//
//                }
//            }
//        }


        //guard condition
        if (i <= 0) {
            return;
        }
        if (i%2 != 0) {
            return;
        }
        if (i >= 100) {
            return;
        }
    }
}
