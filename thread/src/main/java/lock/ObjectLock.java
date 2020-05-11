package lock;

/**
 * 锁与同步机制
 */
public class ObjectLock {

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Thread1(), "Thread1").start();
        //Thread.sleep(10);
        new Thread(new Thread2(), "Thread2").start();
    }

    private static final Object lock = new Object();

    private static class Thread1 implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread1" + ":" + i + ":" + Thread.currentThread().getName());
                }
            }
        }
    }

    ;

    private static class Thread2 implements Runnable {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Thread2" + ":" + i + ":" + Thread.currentThread().getName());
                }
            }
        }
    }

    ;
}
