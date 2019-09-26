package tree;

/**
 * @author xucongyan
 * 二叉树的方法实现
 */
public class BinaryTree implements Tree {

    //表示根节点
    private Node root;

    /**
     * 查找某个节点
     *
     * @param key 需要查找的信息
     * @return 节点的信息
     */
    @Override
    public Node find(int key) {
        Node current = root;
        while (current != null) {
            if (current.data > key) {
                current = current.left;
            } else if (current.data < key) {
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }

    /**
     * 插入一个新的节点
     *
     * @param key 需要插入的信息
     * @return 是否插入成功
     */
    @Override
    public boolean insert(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
            return true;
        } else {
            Node current = root;
            Node parentNode;
            while (current != null) {
                parentNode = current;
                if (current.data > key) {
                    current = current.left;
                    if (current == null) {
                        parentNode.left = newNode;
                        return true;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parentNode.right = newNode;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 中序遍历
     *
     * @param current 当前节点的值
     */
    @Override
    public void infixOrder(Node current) {
        if (current != null) {
            infixOrder(current.left);
            System.out.println(current.data + " ");
            infixOrder(current.right);
        }
    }

    /**
     * 前序遍历
     *
     * @param current 当前节点
     */
    @Override
    public void preOrder(Node current) {
        if (current != null) {
            System.out.println(current.data + " ");
            infixOrder(current.left);
            infixOrder(current.right);
        }
    }

    /**
     * 后序遍历
     *
     * @param current 当前节点
     */
    @Override
    public void postOrder(Node current) {
        if (current != null) {
            infixOrder(current.left);
            infixOrder(current.right);
            System.out.println(current.data + " ");
        }
    }

    /**
     * 查找最大值
     *
     * @return 最大值所在的节点
     */
    @Override
    public Node findMax() {
        Node current = root;
        Node maxNode = current;
        while (current != null) {
            maxNode = current;
            current = current.right;
        }
        return maxNode;
    }

    /**
     * 查找最小值
     *
     * @return 最小值所在的节点
     */
    @Override
    public Node findMin() {
        Node current = root;
        Node minNode = current;
        while (current != null) {
            minNode = current;
            current = current.left;
        }
        return minNode;
    }

    /**
     * 删除某个节点信息
     *
     * @param key 需要删除的信息
     * @return 是否删除成功
     */
    @Override
    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = false;
        //查找删除值，找不到直接返回false
        while (current.data != key) {
            parent = current;
            if (current.data > key) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }

        //如果当前节点没有子节点信息
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                root.left = null;
            } else {
                root.right = null;
            }
            return true;
            //当前节点只有一个右子节点
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
            return true;
            //当前节点只有一个左节点
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
            return true;
        } else {
            //当前节点存在两个子节点
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            return true;
        }
    }

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.right;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        //后继节点不是删除节点的右子节点，将后继节点替换删除节点
        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }
}
