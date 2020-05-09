package thread4;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("主线程输出");


        Thread myThread2 = new MyThread2();
        myThread2.start();

        myThread2.join();

        Thread myThread1 = new MyThread1();
        myThread1.start();
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
