package queue;

/**
 * @author xucongyan
 * 模拟队列的操作
 */
public class MyQueue {

    //队列内容
    private Object[] queArray;

    //队列总大小
    private int maxSize;

    //前端
    private int front;

    //后端
    private int rear;

    //队列中元素的实际数目
    private int items;

    //初始化一个size大小的队列
    public MyQueue(int size) {
        this.maxSize = size;
        queArray = new Object[maxSize];
        this.front = 0;
        this.rear = -1;
        this.items = 0;
    }

    //队列中新增元素
    public void insert(Object value) {
        if (isFull()) {
            System.out.println("队列已满！！！");
        } else {
            //如果队列尾部指向顶了，那么循环回来，执行队列的第一个元素
            if (rear == maxSize - 1) {
                rear = -1;
            }
            //队尾指针加1，然后在队尾指针处插入新的数据
            queArray[++rear] = value;
            items++;
        }
    }

    //移除数据
    public Object remove() {
        Object removeObject;
        if (!isEmpty()) {
            removeObject = queArray[front];
            queArray[front] = null;
            front++;

            if (front == maxSize) {
                front = 0;
            }
            return removeObject;
        }
        return null;
    }

    //查看头部数据
    public Object peekFront() {
        return queArray[front];
    }

    //判断队列是否满
    public boolean isFull() {
        return this.maxSize == this.items;
    }


}
