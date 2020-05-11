package thread4;

/**
 * 线程的阻塞状态
 */
public class BlockedTest {


    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod();
            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod();
            }
        }, "t2");
        t1.start();

        t1.join(1000L);
        //Thread.sleep(1000L);
        t2.start();

        System.out.println(t1.getName() + ":" + t1.getState());
        System.out.println(t2.getName() + ":" + t2.getState());
    }


    private static synchronized void testMethod() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
