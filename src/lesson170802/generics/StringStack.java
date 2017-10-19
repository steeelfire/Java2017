package lesson170802.generics;


import java.util.Arrays;

public class StringStack<E> {
    private static final int DEFAULT_MAX_SIZE = 3;
    private final E[] elements;
    private int size;


    public StringStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStack(int maxSize) {
        elements = (E[]) new Object[maxSize];
        size = 0;
    }

    public boolean push(E string) {
        if (this.size >= this.elements.length) {   //guard condition
            return false;
        }
        //FIXME check for overflow
        this.elements[this.size++] = string;
        return true;
    }

    public E pop() {
        if (size <= 0) {     //guard condition
            return null;    //stack underflow
        }
        E result = elements[--size];
        elements[size] = null;
        return result;
//        size--;
    }

    public E tos() {
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
