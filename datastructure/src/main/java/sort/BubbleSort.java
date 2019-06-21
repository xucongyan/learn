package sort;

/**
 * @author xucongyan
 * 冒泡排序
 */
public class BubbleSort {

    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
