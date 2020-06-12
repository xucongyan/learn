package visitor;

/**
 * @author admin
 * 观察者模式
 */
public class Test {
    public static void main(String[] args) {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
