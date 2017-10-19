package lesson170719.interfaces;

public class RunnableExamples {
    public static void main(String[] args) {
        Runnable task = () ->{
            int count = 0;
            while(true){
                System.out.println(count++);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();

        task.run();
    }
}

