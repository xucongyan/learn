package recursion;

/**
 * @author xucongyan
 * 二分查找法的代码实现，分别使用递归和非递归
 */
public class TwoPoint {

    /**
     * 常规方式进行二分法查找
     *
     * @param array 需要查找的数组
     * @param key   查找的关键字
     * @return 查找到的数据下标
     */
    public static int findTwoPoint(int[] array, int key) {
        if (array == null) {
            return -1;
        }
        int start = 0;
        int last = array.length - 1;

        while (start <= last) {
            int mid = (last - start) / 2 + start;
            if (key == array[mid]) {
                return mid;
            }
            if (key > array[mid]) {
                start = mid + 1;
            }
            if (key < array[mid]) {
                last = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 递归方式进行二分法查找
     *
     * @param array 需要查找的数组
     * @param key   查找的关键字
     * @param start 开始位置
     * @param last  结束位置
     * @return 查找到的数据下标
     */
    public static int search(int[] array, int key, int start, int last) {
        int mid = (last - start) / 2 + start;
        if (key == array[mid]) {
            return mid;
        } else {
            if (key < array[mid]) {
                return search(array, key, start, mid - 1);
            }
            if (key > array[mid]) {
                return search(array, key, mid + 1, last);
            }
        }
        return -1;
    }
}
