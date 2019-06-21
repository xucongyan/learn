package sort;

/**
 * @author xucongyan
 * 选择排序
 */
public class ChoiceSort {

    private static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            if (i != min) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }

        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 8, 9, 5, 7, 6, 1, 3};
        array = sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
