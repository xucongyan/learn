package queue;

/**
 * 队列操作
 *
 * @author xucongyan
 */
public class MyQueue {

    private Object[] queArray;

    private int maxsize;

    private int front;

    private int rear;

    private int elements;

    //初始化一定大小的队列
    public MyQueue(int s) {
        maxsize = s;
        queArray = new Object[maxsize];
        front = 0;
        rear = -1;
        elements = 0;
    }

    //在队尾插入元素
    public void insert(Object value) {
        if (isFull()) {
            throw new OutOfMemoryError("队列已经满了");
        } else {
            //如果指针移到了队尾，那么循环回来
            if (rear == maxsize - 1) {
                rear = -1;
            }
            queArray[++rear] = value;
            elements++;
        }
    }

    //在队头移除元素
    public Object remove() {
        Object removeValue = null;
        if (!isEmpty()) {
            removeValue = queArray[front];
            queArray[front] = null;
            front++;
            if (front == maxsize) {
                front = 0;
            }
            elements--;
        }
        return removeValue;
    }

    //查看队头的数据
    public Object peekFront() {
        return queArray[front];
    }

    //判断队列是否满
    public boolean isFull() {
        return maxsize == elements;
    }

    //判断队列是否空
    public boolean isEmpty() {
        return elements == 0;
    }

    //获取队列大小
    public int getSize() {
        return elements;
    }
}

