package sort;

/**
 * @author xucongyan
 * 插入排序
 */
public class InsertSort {

    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        int j;

        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];//记录要插入的数据
            j = i;
            while (j > 0 && tmp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = tmp;
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
