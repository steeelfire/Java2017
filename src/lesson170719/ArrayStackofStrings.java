package lesson170719;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayStackofStrings extends ArrayDeque<String> {

    @Override
    public void addLast(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public boolean add(String s) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        ArrayStackofStrings stack = new ArrayStackofStrings();
//        stack.add("one");
        stack.push("one");
        stack.push("two");
        stack.push("three");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
