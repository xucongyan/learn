package iterator;

/**
 * @author admin
 * 迭代器模式
 */
public class Test {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("NAME:" + name);
        }
    }
}
