package lesson170802.generics;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();

        s.push("one");
//        s.push(1);

        Stack<Number> n = new Stack<>();

//        n.push("one");
        n.push(1);

    }
}
