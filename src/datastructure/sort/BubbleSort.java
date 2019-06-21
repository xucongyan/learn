package sort;

/**
 * @author xucongyan
 * 冒泡排序
 */
public class BubbleSort {

    private static int[] sort(int[] array) {
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

    public static void main(String[] args) {
        int[] array = {1, 5, 4, 6, 9, 3, 0};

        array = sort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }
}
