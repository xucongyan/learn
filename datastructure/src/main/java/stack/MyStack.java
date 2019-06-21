package stack;

/**
 * @author xucongyan
 * 模拟栈操作
 */
public class MyStack {

    //存储内容
    private int[] array;

    //最大容量
    private int maxSize;

    //栈顶
    private int top;

    public MyStack(int size) {
        this.maxSize = size;
        array = new int[maxSize];
        top = -1;
    }

    //压入数据
    public void push(int value) {
        if (top < maxSize - 1) {
            array[++top] = value;
        }
    }

    //弹出栈顶数据
    public int pop() {
        return array[top--];
    }

    //访问栈顶数据
    public int peek() {
        return array[top];
    }

    //判断栈是否为空
    public boolean isEmpty() {
        return top == -1;
    }

    //判断栈是否满了
    public boolean isFull() {
        return top == maxSize - 1;
    }
}
