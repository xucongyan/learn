package linkedlist;

/**
 * @author xucongyan
 * 有序链表的代码实现
 * 前面的链表实现插入数据都是无序的，在有些应用中需要链表中的数据有序，这称为有序链表。
 * 在有序链表中，数据是按照关键值有序排列的。
 * 一般在大多数需要使用有序数组的场合也可以使用有序链表。
 * 有序链表优于有序数组的地方是插入的速度（因为元素不需要移动），另外链表可以扩展到全部有效的使用内存，而数组只能局限于一个固定的大小中。
 */
public class OrderLinkedList {
    private Node head;

    public OrderLinkedList(){
        head = null;
    }

    //插入节点，并按照从小打到的顺序排列
    public void insert(int value){
        Node node = new Node(value);
        Node pre = null;
        Node current = head;
        while(current != null && value > current.data){
            pre = current;
            current = current.next;
        }
        if(pre == null){
            head = node;
            head.next = current;
        }else{
            pre.next = node;
            node.next = current;
        }
    }

    //删除头节点
    public void deleteHead(){
        head = head.next;
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("");
    }

    private class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
        }
    }

}
