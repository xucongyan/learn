package thread3;

public class Consumer implements Runnable {

    private PublicMap publicMap;

    private int sum;

    public Consumer(PublicMap publicMap) {
        this.publicMap = publicMap;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum += publicMap.get(i);
        }
    }

    public int getSum() {
        return sum;
    }
}
