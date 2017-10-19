package lesson170728.Exceptions;

public class UseStack {
    public static void main(String[] args) {
        StringStack stringStack = new StringStack(3);

        stringStack.push("one");
        stringStack.push("two");
        System.out.println(stringStack.push("three"));
    }
}
