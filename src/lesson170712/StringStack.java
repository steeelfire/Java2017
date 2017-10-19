package lesson170712;


import java.util.Arrays;

public class StringStack {
    private static final int DEFAULT_MAX_SIZE = 3;
    private final String[] elements;
    private int size;


    public StringStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStack(int maxSize) {
        elements = new String[maxSize];
        size = 0;
    }

    public boolean push(String string) {
        if (this.size >= this.elements.length) {   //guard condition
            return false;
        }
        //FIXME check for overflow
        this.elements[this.size++] = string;
        return true;
    }

    public String pop() {
        if (size <= 0) {     //guard condition
            return null;    //stack underflow
        }
        String result = elements[--size];
        elements[size] = null;
        return result;
//        size--;
    }

    public String tos() {
        //guard condition
//stack underflow
        return size <= 0 ? null : elements[size - 1];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements,0,size));
    }
}
