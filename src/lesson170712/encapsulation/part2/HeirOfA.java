package lesson170712.encapsulation.part2;

import lesson170712.encapsulation.A;

public class HeirOfA extends A{
    public static void main(String[] args) {
        A a = new A();
//        a.i = 0;  private - ERROR
//        a.j = 0;  default - ERROR
//        a.k = 0;  protected   - ERROR
        a.m = 0;    //public
        
        HeirOfA heir = new HeirOfA();
//        heir.i = 0;
//        heir.j = 0;
        heir.k = 0; //protected
        heir.m = 0; //public
    }
}
