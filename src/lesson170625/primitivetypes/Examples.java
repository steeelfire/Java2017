package lesson170625.primitivetypes;

public class Examples {
    public static void main(String[] args) {

        //примитивные типы
        int i;  //32
        long l; //64

        short s; //16
        byte b; //8   -128:127
        boolean bl; //64
        char c; //16

        int j;
        int k;
        int m;
        int n;

        float f; //32
        double d; //64

        //примитивные ссылочные переменные
        String a;   //адрес в динамической куче  4байта если 32 битная java машине, 64 в битной. 64 битные работают медленнее
        Object o;
        Examples e = new Examples();
    }
}
