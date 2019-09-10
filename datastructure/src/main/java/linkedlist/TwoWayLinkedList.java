package linkedlist;

/**
 * @author xucongyan
 * 双向链表的代码实现
 */
public class TwoWayLinkedList {

    private Node head;//链表头部元素
    private Node tail;//链表尾部元素
    private int size;//链表的节点个数

    /**
     * 构造方法，初始化一个空的双向链表
     */
    public TwoWayLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * 在链表的头部增加一个元素
     *
     * @param value 需要增加的元素
     */
    public void addHead(Object value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            head.next = head;
            head = newNode;
        }
        size++;
    }

    /**
     * 链表尾部增加元素
     *
     * @param value 需要增加的元素
     */
    public void addTail(Object value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     * 删除链表头部数据
     *
     * @return 删除的数据
     */
    public Node deleteHead() {
        Node temp = head;
        if (!isEmpty()) {
            head = head.next;
            head.prev = null;
            size--;
        }
        return temp;
    }

    /**
     * 删除链表尾部
     *
     * @return 删除的数据
     */
    public Node deleteTail() {
        Node temp = tail;
        if (!isEmpty()) {
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        return temp;
    }

    /**
     * 获取当前链表的节点数
     *
     * @return 数量
     */
    public int getSize() {
        return this.size;
    }

    /**
     * 便利打印链表
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("[]");
        } else {
            Node node = head;
            int tempSize = size;
            if (size == 1) {
                System.out.println("[" + node.data + "]");
                return;
            }
            while (tempSize > 0) {
                if (node.equals(head)) {
                    System.out.print("[" + node.data + "->");
                } else if (node.next == null) {
                    System.out.print(node.data + "]");
                } else {
                    System.out.print(node.data + "->");
                }
                node = node.next;
                tempSize--;
            }
        }
    }

    /**
     * 判断链表对否为空
     *
     * @return true or false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        private Object data;

        private Node next;

        private Node prev;

        public Node(Object data) {
            this.data = data;
        }
    }
}
