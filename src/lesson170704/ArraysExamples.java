package lesson170704;

import java.util.Arrays;

public class ArraysExamples {

    int k=0;
    public static void main(String[] args) {
        int i = 0;

        int j;
        j = 0;
        int[] a = {};
        int b[] = new int[10];
        System.out.println(a.toString());
        System.out.println(b);
        ArraysExamples arraysExamples = new ArraysExamples( );

        System.out.println(arraysExamples.k);
        System.out.println(Arrays.toString(b));
        String []s = new String[3];
        System.out.println(Arrays.toString(s));

        print(s);

    }

    private static void print(String[] arrayOfStrings) {
        int index = 0;
        while(index<arrayOfStrings.length){
            System.out.println(arrayOfStrings[index++]);
//            index = index + 1;
//            index +=1;
//            index++;
        }
    }
}
