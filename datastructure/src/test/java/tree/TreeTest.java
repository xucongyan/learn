package tree;

import org.junit.Test;

/**
 * @author xucongyan
 */
public class TreeTest {

    @Test
    public void test(){
        BinaryTree bt = new BinaryTree();
        bt.insert(50);
        bt.insert(20);
        bt.insert(80);
        bt.insert(10);
        bt.insert(30);
        bt.insert(60);
        bt.insert(90);
        bt.insert(25);
        bt.insert(85);
        bt.insert(100);

        bt.infixOrder(bt.find(50));
        bt.preOrder(bt.find(50));
        bt.postOrder(bt.find(50));

        bt.delete(10);//删除没有子节点的节点
        bt.delete(30);//删除有一个子节点的节点
        bt.delete(80);//删除有两个子节点的节点
        System.out.println(bt.findMax().data);
        System.out.println(bt.findMin().data);
        System.out.println(bt.find(20));
        System.out.println(bt.find(200));
    }
}
