package mediator;

/**
 * @author admin
 * 中介者模式
 */
public class Test {
    public static void main(String[] args) {
        User robert = new User("robert ");
        User john = new User("john  ");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
