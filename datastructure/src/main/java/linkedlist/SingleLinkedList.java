package linkedlist;

/**
 * @author xucongyan
 * 单向链表的代码实现
 * <p>
 * 单向链表只可向一个方向遍历，一般查找一个节点的时候需要从第一个节点开始每次访问下一个节点，一直访问到需要的位置。
 * 而插入一个节点，对于单向链表，我们只提供在链表头插入，只需要将当前插入的节点设置为头节点，next指向原头节点即可。
 * 删除一个节点，我们将该节点的上一个节点的next指向该节点的下一个节点
 */
public class SingleLinkedList {

    private int size; //链表节点的个数
    private Node head; //头结点

    /**
     * 构造方法
     */
    public SingleLinkedList() {
        size = 0;
        head = null;
    }

    /**
     * 在链表的头部添加元素
     *
     * @param obj 需要添加的内容
     * @return 添加的内容
     */
    public Object addHead(Object obj) {
        Node newHead = new Node(obj);
        if (size == 0) {
            head = newHead;
        } else {
            newHead.next = head;
            head = newHead;
        }
        size++;
        return obj;
    }

    /**
     * 链表的头部删除元素
     *
     * @return 删除掉的元素
     */
    public Object deleteHead() {
        if (size == 0) {
            return null;
        }
        Object obj = head.data;
        head = head.next;
        size--;
        return obj;
    }

    /**
     * 查找指定元素
     *
     * @param obj 需要查找的元素
     * @return 返回的节点信息
     */
    public Node findObject(Object obj) {
        if (obj == null) {
            return null;
        }
        Node current = head;
        int tempSize = size;

        while (size > 0) {
            if (obj.equals(current.data)) {
                return current;
            } else {
                current = current.next;
            }
            tempSize--;
        }
        return null;
    }

    /**
     * 删除指定的元素
     *
     * @param obj 需要删除的元素
     * @return 是否删除成功
     */
    public boolean deleteObject(Object obj) {
        if (size == 0 || obj == null) {
            return false;
        }

        Node current = head; //当前节点信息
        Node previous = head; //前一个节点信息

        while (current.data != obj) {
            //对象不在链表中
            if (current.next == null) {
                return false;
            } else {
                previous = current;
                current = current.next;
            }
        }

        //如果是删除的第一个节点信息
        if (current == head) {
            head = current.next;
            size--;
        } else {
            previous.next = current.next;
            size--;
        }
        return true;
    }

    /**
     * 判断链表是否为空
     *
     * @return 是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 显示节点信息
     */
    public void display() {
        if (size > 0) {
            Node node = head;
            int template = size;
            if (template == 1) {
                System.out.println("[" + node.data + "]");
                return;
            }
            while (template > 0) {
                if (node.equals(head)) {
                    System.out.print("[" + node.data + "->");
                } else if (node.next == null) {
                    System.out.print(node.data + "]");
                } else {
                    System.out.print(node.data + "->");
                }
                node = node.next;
                template--;
            }
            System.out.println();
        } else {
            System.out.println("[]");
        }
    }

    /**
     * 内部类
     * 代表链表的每一个节点
     */
    private class Node {
        private Object data; //节点上存放的内容
        private Node next; //下一个节点信息

        public Node(Object data) {
            this.data = data;
        }

    }
}
