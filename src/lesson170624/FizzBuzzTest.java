package lesson170624;

import mytestframework.Asserts;

public class FizzBuzzTest {
    public static void main(String[] args) {
        System.out.println("start");

        System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(3), "Fizz"));
        System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(6), "Fizz"));
        System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(300), "Fizz"));
        System.out.println(Asserts.assertNotEquals(FizzBuzz.fizzBuzz(5), "Fizz"));
    }
}
