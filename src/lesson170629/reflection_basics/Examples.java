package lesson170629.reflection_basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Examples {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Class<A> c = A.class;
        for (Method meth :
                c.getMethods()) {
            System.out.println(meth);
        }

//        A a = new A();

        A a = c.newInstance();

        Constructor<A> constructor = c.getConstructor(null);
        constructor.newInstance(null);

        System.out.println(a);
        Method m = c.getMethod("m",null);


//        a.m();    эквивалент
        m.invoke(a,null);
    }



}
