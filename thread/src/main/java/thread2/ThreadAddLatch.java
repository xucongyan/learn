package thread2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 启动5个线程，并发对1-10000之间的数字求和，并打印结果
 */
public class ThreadAddLatch {

    private static int sum = 0;
    private static final Object LOCK = new Object();
    private static CountDownLatch countdown = new CountDownLatch(4);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 4; i++) {
            final int k = i;
            executorService.execute(() -> {
                synchronized (LOCK) {
                    for (int j = k * 25 + 1; j <= (k + 1) * 25; j++) {
                        sum += j;
                    }
                    System.out.println(sum);
                }
                countdown.countDown();
            });
        }
        try {
            countdown.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sum);

        executorService.shutdown();
    }
}
