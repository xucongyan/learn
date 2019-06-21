package sort;

import org.junit.Test;

/**
 * @author xucongyan
 */
public class SortTest {

    @Test
    public void testInsertSort(){
        int[] array = {4, 2, 8, 9, 5, 7, 6, 1, 3};
        array = InsertSort.sort(array);
        assert array != null;
        for (int i : array) {
            System.out.println(i);
        }
    }

    @Test
    public void testBubbleSort(){

        int[] array = {1, 5, 4, 6, 9, 3, 0};

        array = BubbleSort.sort(array);

        assert array != null;
        for (int i : array) {
            System.out.println(i);
        }
    }

    @Test
    public void testChoiceSort(){
        int[] array = {4, 2, 8, 9, 5, 7, 6, 1, 3};
        array = ChoiceSort.sort(array);
        assert array != null;
        for (int i : array) {
            System.out.println(i);
        }
    }
}
