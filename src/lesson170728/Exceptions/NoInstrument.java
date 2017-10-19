package lesson170728.Exceptions;

public class NoInstrument extends RuntimeException {
    public NoInstrument(Exception cause) {
        super(cause);
    }
}
