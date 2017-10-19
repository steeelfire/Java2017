package lesson170704;

import java.util.Arrays;

public class ArraysInit {
    public static void main(String[] args) {
        int[][] m = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };

        int[][] m2 = new int[2][3];
        int[][] m3;
        m3 = new int[2][];

        System.out.println(Arrays.toString(m3));

        m3[0] = new int[3];
        m3[1] = new int[3];
//        m3[2] = new int [3];  ERROR!

        int[][][] cube;

        int[] matrix = {0, 0, 1, 0, 2, 1, 3, 2, 1};
        int n = 3;

        int t[];
        t = squareup(0);
        System.out.println(Arrays.toString(t));

        t = squareup(1);
        System.out.println(Arrays.toString(t));

        t = squareup(2);
        System.out.println(Arrays.toString(t));

        t = squareup(3);
        System.out.println(Arrays.toString(t));

        t = squareup(4);
        System.out.println(Arrays.toString(t));


    }

    //0 1 2  3 4 5  6 7 8
    //3 2 1  3 2 1  3 2 1


    private static int[] squareup(int n) {

        int[] r = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) {

                } else {
                    r[i * n + j] = n - j;
                }
            }
        }
        return r;
    }

    public boolean sameFirstLast(int[] nums) {
        return false;
    }

}
