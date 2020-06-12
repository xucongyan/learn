package strategy;

/**
 * @author admin
 * 策略模式
 */
public class Test {

    public static void main(String[] args) {
        new OperationAdd();
        new OperationMultiply();
        new OperationSubtract();

        System.out.println("10 + 5 = " + Operation.executeStrategy("ADD", 10, 5));
    }
}
