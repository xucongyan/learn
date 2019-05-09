package thread3;

public class Producer implements Runnable {

    private PublicMap publicMap;

    public Producer(PublicMap publicMap){
        this.publicMap = publicMap;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publicMap.put(i);
        }
    }
}
