package com.universidad.salesiana.examples;

public class TreeNodeImpl<T> implements TreeNode<T> {
    //parameters
    private T data;
    private TreeNode<T> parentNode;
    private TreeNode<T> leftNode;
    private TreeNode<T> rightNode;

    public TreeNodeImpl(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return this.data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public TreeNode<T> getParentNode() {
        return this.parentNode;
    }

    @Override
    public void setParentNode(TreeNode<T> parent) {
        this.parentNode = parent;
    }

    @Override
    public TreeNode<T> getLeftNode() {
        return this.leftNode;
    }

    @Override
    public void setLeftNode(TreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    @Override
    public TreeNode<T> getRightNode() {
        return this.rightNode;
    }

    @Override
    public void setRightNode(TreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public boolean isBalanced() {
        return false;
    }
}
