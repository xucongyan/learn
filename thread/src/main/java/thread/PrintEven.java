package thread;

//打印偶数
public class PrintEven implements Runnable {

    private final Num num;

    PrintEven(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num.i < 100) {
            synchronized (num) {
                if (num.flag) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("偶数为:" + num.i);
                    num.i++;
                    num.flag = true;
                    num.notify();
                }
            }
        }
    }
}
