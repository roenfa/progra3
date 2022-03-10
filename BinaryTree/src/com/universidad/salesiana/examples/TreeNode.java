package com.universidad.salesiana.examples;

public interface TreeNode<T> {
    // data
    T getData();
    void setData(T data);

    TreeNode<T> getParentNode();
    void setParentNode(TreeNode<T> parent);

    // left node
    TreeNode<T> getLeftNode();
    void setLeftNode(TreeNode<T> leftNode);

    // right node
    TreeNode<T> getRightNode();
    void setRightNode(TreeNode<T> rightNode);

    boolean isBalanced();
}
