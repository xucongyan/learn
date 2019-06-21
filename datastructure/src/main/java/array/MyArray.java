package array;

/**
 * @author xucongyan
 * <p>
 * ①、如何插入一条新的数据项
 * <p>
 * 　　②、如何寻找某一特定的数据项
 * <p>
 * 　　③、如何删除某一特定的数据项
 * <p>
 * 　　④、如何迭代的访问各个数据项，以便进行显示或其他操作
 */
public class MyArray {

    //定义一个有效的数据，用来存储对象
    private Object[] objArray;

    //数组的实际存储长度
    private int elems;

    //数据的最大存储长度
    private int length;

    //默认构造方法，构造一个长度为50的数据
    public MyArray() {
        elems = 0;
        length = 50;
        objArray = new Object[length];
    }

    //构造方法一个长度为length的数组
    public MyArray(int length) {
        elems = 0;
        this.length = length;
        objArray = new Object[this.length];
    }

    //获取数组的实际存储长度
    public int getSize() {
        return this.elems;
    }

    //获取数组的最大存储长度
    public int getMaxSize() {
        return this.length;
    }

    /**
     * 遍历数组
     */
    public void display() {
        for (int i = 0; i < elems; i++) {
            System.out.print(objArray[i] + "\n");
        }
    }

    /**
     * 向数组中添加元素，数组的下标是从0开始的，谨记
     *
     * @param value 需要添加的元素
     * @return 是否添加成功
     */
    public boolean add(Object value) {
        if (elems == length) {
            //达到了数组的最大长度
            return false;
        } else {
            objArray[elems] = value;
            elems++;
            return true;
        }
    }

    /**
     * 从数组中获取元素
     *
     * @param i 需要数据元素的下标
     * @return 获取的元素的值
     * 注意要结合上面的add方法来判断越界的临界值
     */
    public Object get(int i) {
        if (i < 0 || i > elems) {
            throw new IndexOutOfBoundsException();
        } else {
            return objArray[i];
        }
    }

    /**
     * 查询某个元素查询在数组中的下标的值
     *
     * @param searchValue 需要查询的元素
     * @return 下标值
     */
    public int find(Object searchValue) {
        if (searchValue == null) {
            return -1;
        }
        int i;
        for (i = 0; i < elems; i++) {
            if (objArray[i] == searchValue) {
                break;
            }
        }
        if (i == elems) {
            return -1;
        }
        return i;
    }

    /**
     * 从数组中删除某个元素
     *
     * @param value 需要删除的元素
     * @return 是否删除成功
     */
    public boolean delete(int value) {
        int index = find(value);
        if (index == -1) {
            return false;
        } else {
            if (index == elems - 1) {
                elems--;
            } else {
                for (int i = index; i < elems - 1; i++) {
                    objArray[i] = objArray[i + 1];
                    elems--;
                }
            }
            return true;
        }
    }

    /**
     * 修改某个元素在数组中的值
     *
     * @param newValue 新的值
     * @param oldValue 需要修改的值
     * @return 是否修改成功
     */
    public boolean modify(Object newValue, Object oldValue) {
        int index = find(oldValue);
        if (index == -1) {
            return false;
        } else {
            objArray[index] = newValue;
            return true;
        }

    }
}
