package thread;

public class Test {
    public static void main(String[] args) {
        Num num = new Num();

        PrintOdd printOdd = new PrintOdd(num);

        PrintEven printEven = new PrintEven(num);

        Thread thread1 = new Thread(printEven);
        Thread thread2 = new Thread(printOdd);

        thread1.start();
        thread2.start();
    }
}
