package lesson170728.Exceptions;

public class ReThrowExample {
    public static void main(String[] args) {
        try {
            buildHouse();
        } catch (Exception e) {
            e.printStackTrace();
//            Exception c = e;
//            while (c != null) {
//                c.printStackTrace();
//                c = (Exception) c.getCause();
//            }
        }
    }

    private static void buildHouse() {
        try {
            buildBasement();
        } catch (Exception e) {
            throw new TroubleWithMachinery(e);
        }
    }

    private static void buildBasement() {
        try {
            digPit();
        } catch (Exception e) {
            throw new NoInstrument(e);
//            throw e;
        }

    }

    private static void digPit() throws NoShown {
        throw new NoShown();
    }
}
