package thread4;

import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        //不使用FutureTask的实现方式
        Future<Integer> result = executor.submit(new Task());
        System.out.println(result.get());


        //使用FutureTask的实现方式
        FutureTask<Integer> futureTask = new FutureTask<>(new Task());
        executor.submit(futureTask);
        System.out.println(futureTask.get());

        executor.shutdown();
    }

    private static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            Thread.sleep(1000);
            return Integer.MAX_VALUE;
        }
    }
}
