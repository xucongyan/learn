package thread;

//打印奇数
public class PrintOdd implements Runnable {

    private final Num num;

    PrintOdd(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (num.i < 100) {
            synchronized (num) {
                if (!num.flag) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("奇数为:" + num.i);
                    num.i++;
                    num.flag = false;
                    num.notify();
                }
            }
        }
    }
}
