package lesson170710.wraperclasses;

import java.util.Hashtable;

public class WrapperClasses {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();  //таблица соответсвтвий
        int[] a = {0,10,20,30};
        //0->0
        //1->10
        //2->20
        //...

        System.out.println(a[1]);
        a[2] = 50;

        table.put("Ivanov","123-45-65");
        table.put("Petrov","123-45-55");
        table.put("Sidorov","123-45-95");

        System.out.println(table);

        table.put("Ivanov","123-99-65");

        System.out.println(table);

        table.put(new Integer(1),"один");
        table.put(new Integer(10000),"один");

        table.put(2,"two");
        table.put(100,"thousend");

    }
}
