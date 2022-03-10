package com.universidad.salesiana.examples;

public class BinaryTreeImpl<T extends Comparable<T>> implements BinaryTree<T> {
    private TreeNode<T> rootNode;
    private int height;
    private int weight;

    public BinaryTreeImpl(TreeNode<T> rootNode) {
        this.rootNode = rootNode;
    }

    @Override
    public TreeNode<T> getRootNode() {
        return this.rootNode;
    }

    @Override
    public void setRootNode(TreeNode<T> rootNode) {
        this.rootNode = rootNode;
    }

    @Override
    public void insert(T data) {
        this.rootNode = insertRecursive(this.rootNode, data);
    }

    private TreeNode<T> insertRecursive(TreeNode<T> rootNode, T data) {
        if (rootNode == null) {
            rootNode = new TreeNodeImpl<T>(data);
            return rootNode;
        }

        // insert left or insert right???
        if (data.compareTo(rootNode.getData()) < 0) { // insert to left side
            rootNode.setLeftNode(insertRecursive(rootNode.getLeftNode(), data)); //
        } else {
            if (data.compareTo(rootNode.getData()) > 0) {
                rootNode.setRightNode(insertRecursive(rootNode.getRightNode(), data));
            }
        }

        return rootNode;
    }

    @Override
    public void insert(T data, TreeNode<T> parentNode) {

    }

    @Override
    public void remove(T data) {

    }

    @Override
    public TreeNode<T> find(T data) {
        return null;
    }

    @Override
    public boolean contains(T data) {
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
