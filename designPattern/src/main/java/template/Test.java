package template;

/**
 * @author admin
 * 模板模式
 */
public class Test {
    public static void main(String[] args) {

        Game cricket = new Cricket();
        cricket.play();

        System.out.println("更换下一个模板");

        Game football = new Football();
        football.play();
    }
}
