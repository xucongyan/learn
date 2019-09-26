package tree;

/**
 * @author xucongyan
 * 二叉树的节点类，描述二叉树的每一个节点信息
 */
public class Node {

    //节点存储的信息
    int data;

    //左子节点
    Node left;

    //右子节点
    Node right;

    //表示节点是否被删除
    boolean isDelete;

    public Node(int data) {
        this.data = data;
    }

    public void display() {
        System.out.println(data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                ", isDelete=" + isDelete +
                '}';
    }
}
