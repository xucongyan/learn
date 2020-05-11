package lock;

public class Join {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Thread1(),"thread");

        thread.start();
        thread.join();

        System.out.println("如果不加join⽅法，我会先被打出来，加了就不⼀样了");
    }

    private static class Thread1 implements Runnable{

        @Override
        public void run() {
            System.out.println("我是⼦线程，我先睡⼀秒");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("我是⼦线程，我睡完了⼀秒");
        }
    }
}
