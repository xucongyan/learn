package thread4;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread myThread2 = new MyThread2();
        myThread2.start();

        Thread myThread1 = new MyThread1();
        myThread1.start();

        myThread1.join();
        myThread2.join();

        System.out.println("主线程输出");
    }


    private static class MyThread1 extends Thread {
        @Override
        public void run() {
            System.out.println("多线程1测试");
        }
    }

    private static class MyThread2 extends Thread {
        @Override
        public void run() {
            System.out.println("多线程2测试");
        }
    }
}
