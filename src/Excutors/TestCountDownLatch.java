package Excutors;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCountDownLatch {

    //主要用到的方法是：CountDownLatch，
    //CountDownLatch类是一个同步倒数计数器,构造时传入int参数,
    //该参数就是计数器的初始值，
    //每调用一次countDown()方法，计数器减1,计数器大于0 时，
    //await()方法会阻塞后面程序执行，直到计数器为0，后面被阻塞的方法才会得以实行。
    //await(long timeout, TimeUnitunit)，是等待一定时间，然后执行，
    //不管计数器是否到0了。

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        DiskMemory diskMemory = new DiskMemory();

        for (int i = 0; i < 4; i++) {
            executorService.execute(() -> {
                int size = diskMemory.getSize();

                System.out.println("size=" + size);

                diskMemory.setSize(size);

                countDownLatch.countDown();
            });
        }

        countDownLatch.await();

        int totalSize = diskMemory.getTotalSize();
        System.out.println("totalSize=" + totalSize);

        executorService.shutdown();

    }
}
