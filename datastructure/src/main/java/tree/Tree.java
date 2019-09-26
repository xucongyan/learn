package tree;

/**
 * @author xucongyan
 * 二叉树的方法
 */
public interface Tree {

    /**
     * 查找某个节点
     *
     * @param key 需要查找的信息
     * @return 节点的信息
     */
    Node find(int key);

    /**
     * 插入一个新的节点
     *
     * @param key 需要插入的信息
     * @return 是否插入成功
     */
    boolean insert(int key);

    /**
     * 中序遍历
     *
     * @param current 当前节点
     */
    void infixOrder(Node current);

    /**
     * 前序遍历
     *
     * @param current 当前节点
     */
    void preOrder(Node current);

    /**
     * 后序遍历
     *
     * @param current 当前节点
     */
    void postOrder(Node current);

    /**
     * 查找最大值
     *
     * @return 最大值所在的节点
     */
    Node findMax();

    /**
     * 查找最小值
     *
     * @return 最小值所在的节点
     */
    Node findMin();

    /**
     * 删除某个节点信息
     *
     * @param key 需要删除的信息
     * @return 是否删除成功
     */
    boolean delete(int key);
}
