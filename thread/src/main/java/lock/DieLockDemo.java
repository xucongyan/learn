package lock;

//创建死锁的例子
public class DieLockDemo {
    private static final String str1 = "str1";
    private static final String str2 = "str2";

    public static void main(String[] args) {
        Thread thread1 = new Thread(
                () -> {
                    try {
                        while (true) {
                            synchronized (DieLockDemo.str1) {
                                System.out.println(Thread.currentThread().getName()+"锁住了str1");
                                Thread.sleep(1000);
                                synchronized (DieLockDemo.str2) {
                                    System.out.println(Thread.currentThread().getName()+"锁住了str2");
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    try {
                        while (true){
                            synchronized (DieLockDemo.str2){
                                System.out.println(Thread.currentThread().getName()+"锁住了str2");
                                Thread.sleep(1000);
                                synchronized (DieLockDemo.str1){
                                    System.out.println(Thread.currentThread().getName()+"锁住了str1");
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );

        thread1.start();
        thread2.start();
    }
}
