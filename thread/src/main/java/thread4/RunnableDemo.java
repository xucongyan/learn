package thread4;

public class RunnableDemo {

    public static void main(String[] args) {

        System.out.println("主线程输出");

        MyThread myThread = new MyThread();

        Thread thread = new Thread(myThread);

        thread.start();

        //以下是java8的写法，上面是java8以前的写法

        new Thread(() -> {
            System.out.println("Java 8 匿名内部类" + Thread.currentThread().getName());
        }).start();

    }

    private static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("测试多线程" + Thread.currentThread().getName());
        }
    }
}
