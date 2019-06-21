package thread3;

public class Test {
    public static void main(String[] args) {

        PublicMap publicMap = new PublicMap();

        Producer producer = new Producer(publicMap);

        Consumer consumer = new Consumer(publicMap);

        Thread thread1 = new Thread(producer);

        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}
