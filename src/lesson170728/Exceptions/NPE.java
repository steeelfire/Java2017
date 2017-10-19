package lesson170728.Exceptions;

public class NPE {
    public static void main(String[] args) {

        try {
            printObjectInfo(null);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }


        printObjectInfo(new Object());
    }

    private static void printObjectInfo(Object o){

        if(o == null){
            return;
        }
        System.out.println("Class name " + o.getClass().getCanonicalName());
        System.out.println("Class name " + o.hashCode());
        System.out.println("Class name " + o.toString());
    }
}
