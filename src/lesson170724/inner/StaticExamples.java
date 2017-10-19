package lesson170724.inner;

public class StaticExamples {
    static class A extends StaticExamples{
        static class B extends A{

        }
    }

    static class X{

        static int Z = 0;
        int state = 0;
        public void change(){state++;}

        public void evaluate(){
            state = 20;
            change();
            change();
        }
        static class Y {
            public void process(){
                Z=50;
                StaticExamples.X.Z = 50;
//                state = 20;       ERROR!!!
//                change();
//                change();
            }
        }
    }

}
