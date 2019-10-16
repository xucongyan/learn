package recursion;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testGetFactorialFor() {
        int result = Factorial.getFactorialFor(4);
        Assert.assertEquals(result, 24);
    }


    @Test
    public void testGetFactorial() {
        int result = Factorial.getFactorial(4);
        Assert.assertEquals(result, 24);
    }

    @Test
    public void testFindTwoPoint() {
        int[] array = {1, 3, 5, 7, 9, 11, 15, 16, 18, 19, 33, 56};
        int result = TwoPoint.findTwoPoint(array, 3);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testSearch() {
        int[] array = {1, 3, 5, 7, 9, 11, 15, 16, 18, 19, 33, 56};
        int result = TwoPoint.search(array, 5, 0, array.length - 1);
        Assert.assertEquals(2, result);
    }


    @Test
    public void testHanNuoTa() {
        HanNuoTa.move(5, "A", "B", "C");
    }
}
