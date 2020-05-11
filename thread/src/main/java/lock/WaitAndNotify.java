package lock;

/**
 * 等待/通知机制
 */
public class WaitAndNotify {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Thread1(), "thread1");
        Thread thread2 = new Thread(new Thread2(), "thread2");

        thread1.start();
        Thread.sleep(1000);
        thread2.start();
    }

    private static Object lock = new Object();


    private static class Thread1 implements Runnable {


        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("Thread1 :" + i);
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }
    }


    private static class Thread2 implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("Thread2 :" + i);
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }
    }
}
