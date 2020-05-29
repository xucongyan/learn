package factory.abstractFactory;

/**
 * 抽象工厂模式
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new AK_Factory();

        Bullet bullet = factory.produceBullet();

        Gun gun = factory.produceGun();

        bullet.load();
        gun.shooting();
    }
}
