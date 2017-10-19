package lesson170804.generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardsExample {
    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1,2,3);
        List<Double> doubles = Arrays.asList(1.2,2.,3.5);

//        List<Double> nums = ints;

        printNumbers(ints);
        printNumbers(doubles);

        List<Number> nums = new ArrayList<>();
        List<Integer> list2;

        fill(nums);
//        fill(list2);

    }

    private static void fill(List<? super Number> nums) {   //Lower bound Store is allowed
        nums.add(1.36);

        Object obj = (Number)nums.get(1);
    }

    private static void printNumbers(List<? extends Number> nums) { //Upper bound, EXTRact  is allowed
        for (Number number :
                nums) {
            System.out.println(number);
        }
//        nums.add(1.45); error
    }
}
