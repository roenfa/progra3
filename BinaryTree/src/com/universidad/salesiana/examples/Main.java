package com.universidad.salesiana.examples;

public class Main {
    public static void main(String args[]) {
        TreeNode<Integer> rootNode = new TreeNodeImpl<>(40);

        BinaryTree<Integer> binaryTree = new BinaryTreeImpl<>(rootNode);
        //      40
        //  10      60
        // 8  12  55

        binaryTree.insert(10);
        binaryTree.insert(8);
        binaryTree.insert(60);
        binaryTree.insert(12);
        binaryTree.insert(55);

        binaryTree.print();

        binaryTree.insert(100);

        binaryTree.print();

        //40
        //10 60
        //8 12 55
    }
}
