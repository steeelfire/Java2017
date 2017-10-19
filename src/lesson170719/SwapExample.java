package lesson170719;

public class SwapExample {
    public static void main(String[] args) {

        int x = 100;
        int y = 50;

        int tmp = x;
        x=y;
        y=tmp;

        x=x+y;   //x==100 + 50 ==150

        y=x-y;  //y=100

        x=x-y; //x = 50

        swap(x,y);
    }

    private static void swap(int x, int y) {
        int tmp = x;
        x=y;
        y=tmp;
    }
}
