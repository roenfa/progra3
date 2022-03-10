package com.universidad.salesiana.examples;

public interface BinaryTree<T> {
    TreeNode<T> getRootNode();
    void setRootNode(TreeNode<T> rootNode);

    void insert(T data);
    void insert(T data, TreeNode<T> parentNode);

    void remove(T data);

    TreeNode<T> find(T data); // return same element
    boolean contains(T data); // true / false

    void print();

    int getHeight();
    int getWeight();

    //       1
    //   3       6
    // 2   4   5   7

    // new element 9
    // find element 6 -> 6
}
