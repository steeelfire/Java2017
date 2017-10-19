package lesson170728.Exceptions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryFinallyExample {
    static class Counter {
        Lock _lock = new ReentrantLock();
        int count;

        public void inc() {

            _lock.lock();
            try {
                internal();
            } finally {
                _lock.unlock();
            }
        }

        private void internal() {
            count++;
        }

        public int getCount() {
            _lock.lock();

            int result;
            try {
                result = count;
                return result;
            } finally {
                _lock.unlock();

            }


        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        new Thread(task(counter)).start();
        new Thread(task(counter)).start();
    }

    private static Runnable task(Counter counter) {
        return () -> {
            while (true) {
                counter.inc();
                System.out.println(counter.getCount());
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
