package lesson170728.Exceptions;

public class TroubleWithMachinery extends RuntimeException{
    public TroubleWithMachinery() {
    }

    public TroubleWithMachinery(Exception e) {
        super(e);
    }
}
