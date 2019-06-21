package stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author xucongyan
 * 增强功能版的栈
 */
public class Stack {

    private Object[] elementData;

    //指向栈顶的指针
    private int top;

    private int size;

    //初始化一个默认大小为10的栈
    public Stack() {
        elementData = new Object[10];
        this.top = -1;
        this.size = 10;
    }

    //初始化一定容量大小的栈
    public Stack(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("栈初始容量不能小于0: " + initialCapacity);
        }

        this.elementData = new Object[initialCapacity];
        this.top = -1;
        this.size = initialCapacity;
    }

    //压入元素
    public Object push(Object item) {

        //是否需要扩容
        isGrow(top + 1);
        elementData[++top] = item;
        return item;
    }

    //弹出栈顶元素
    public Object pop() {
        Object object = peek();
        remove(top);
        return object;
    }

    //获取栈顶元素
    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elementData[top];
    }

    //判断是否为空
    public boolean isEmpty() {
        return top == -1;
    }

    //删除栈顶元素
    public void remove(int top) {
        elementData[top] = null;
        this.top--;
    }

    /**
     * 是否需要扩容，如果需要，则扩大一倍并返回true，不需要则返回false
     *
     * @param minCapacity 插入数据之后的容量
     * @return 是否需要扩容
     */
    public boolean isGrow(int minCapacity) {
        int oldCapacity = size;

        if (minCapacity >= oldCapacity) {
            //定义扩大之后栈的总容量
            int newCapacity = 0;
            if ((oldCapacity << 1) - Integer.MAX_VALUE > 0) {
                newCapacity = Integer.MAX_VALUE;
            } else {
                newCapacity = (oldCapacity << 1);//左移一位，相当于*2
            }
            this.size = newCapacity;
            elementData = Arrays.copyOf(elementData, size);
            return true;
        }
        return false;
    }
}
