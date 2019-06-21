package array;

import org.junit.Test;

/**
 * @author xucongyan
 */
public class MyArrayTest {

    @Test
    public void main() {
        MyArray myArray = new MyArray(5);

        myArray.add(9);
        myArray.add(8);
        myArray.add(7);
        myArray.add(6);
        myArray.add(5);

        myArray.display();

        System.out.println(myArray.get(0));

        myArray.delete(1);

        myArray.modify(3, 33);
        myArray.display();
    }
}
