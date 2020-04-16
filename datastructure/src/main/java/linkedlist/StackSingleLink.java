package linkedlist;

/**
 * @author xucongyan
 * 用单向链表实现栈
 * 栈的pop()方法和push()方法，对应于链表的在头部删除元素deleteHead()以及在头部增加元素addHead()
 */
public class StackSingleLink {

    private SingleLinkedList link;

    public StackSingleLink() {
        link = new SingleLinkedList();
    }

    /**
     * 栈顶添加元素
     *
     * @param object 需要添加的元素
     */
    public void push(Object object) {
        link.addHead(object);
    }

    /**
     * 弹出栈顶元素
     *
     * @return 弹出的元素
     */
    public Object pop() {
        return link.deleteHead();
    }

    /**
     * 判断栈是否为空
     *
     * @return true or false
     */
    public boolean isEmpty() {
        return link.isEmpty();
    }

    /**
     * 打印栈内的元素
     */
    public void display() {
        link.display();
    }
}
