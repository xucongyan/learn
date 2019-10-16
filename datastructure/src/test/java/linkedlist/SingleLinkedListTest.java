package linkedlist;

import org.junit.Test;

public class SingleLinkedListTest {

    @Test
    public void test() {
        SingleLinkedList singleList = new SingleLinkedList();
        singleList.addHead("A");
        singleList.addHead("B");
        singleList.addHead("C");
        singleList.addHead("D");
        //打印当前链表信息
        singleList.display();
        //删除C
        singleList.deleteObject("C");
        singleList.display();
        //查找B
        System.out.println(singleList.findObject("B"));
    }

}
