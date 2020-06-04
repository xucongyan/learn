package proxy;

/**
 * 代理模式
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new ProxySubject();

        subject.Request();
    }
}

