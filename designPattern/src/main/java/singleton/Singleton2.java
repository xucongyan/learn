package singleton;

/**
 * @author admin
 * 懒汉式单例模式
 */
public class Singleton2 {

    private Singleton2() {

    }

    private static Singleton2 singleton;

    public static Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }

        return singleton;
    }
}
