package lesson170706;

public class StringExamples {
    public static void main(String[] args) {
        String s = "helo";
        String concat = s.concat(" ,world");

        System.out.println(concat);

        String newMessage = s + ", world";

        System.out.println(newMessage);
    }
}
