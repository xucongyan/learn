package singleton;

/**
 * @author admin
 * 懒汉式双重检查加锁版本
 */
public class Singleton3 {

    private Singleton3() {

    }

    private volatile static Singleton3 singleton;

    public static Singleton3 getInstance() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }

        return singleton;
    }
}
