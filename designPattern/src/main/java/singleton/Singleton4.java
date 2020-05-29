package singleton;

/**
 * @author admin
 * 懒汉式，静态内部类方式版本
 */
public class Singleton4 {

    private static class SingletonHolder {
        private static final Singleton4 singleton = new Singleton4();
    }

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return SingletonHolder.singleton;
    }
}
