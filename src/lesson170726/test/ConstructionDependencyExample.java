package lesson170726.test;

public class ConstructionDependencyExample{
    static Worker create(){
        class BigTroll implements Worker{

            @Override
            public void doIt() {
                System.out.println("no");
            }
        }
        return new BigTroll();
    }

    static class B implements Worker {

        @Override
        public void doIt() {
            System.out.println("did it");
        }
    }
    static class A{

        private Worker b;

        public A(B b) {
            this.b = b;
        }

        public void setWorker(Worker b) {
            this.b = b;
        }

        void change(){
            b.doIt();
        }
    }

    public static void main(String[] args) {
        A a = new A(new B());
        a = new A(new B(){
            @Override
            public void doIt() {
                super.doIt();
            }
        });
        a.change();
        class C extends B{
            @Override
            public void doIt() {
                System.out.println("c-style");
            }
        }
        a.setWorker(new Worker() {
            @Override
            public void doIt() {

            }
        });
        a.change();
        a.setWorker(()->{System.out.println("Done");});
        a.setWorker(create());
        int x = 0;
    }
}
