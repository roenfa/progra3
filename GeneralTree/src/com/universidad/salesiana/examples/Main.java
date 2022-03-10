package com.universidad.salesiana.examples;

public class Main {
    public static void main(String args[]) {
        TreeNode<Integer> rootNode = new TreeNode<Integer>(1);
        rootNode.getChildren().add(new TreeNode<Integer>(2));
        rootNode.getChildren().add(new TreeNode<Integer>(3));
        rootNode.getChildren().add(new TreeNode<Integer>(4));

        var child1 = rootNode.getChildren().get(0); // first child of root node
        child1.getChildren().add(new TreeNode<Integer>(5));
        child1.getChildren().add(new TreeNode<Integer>(6));

        var child3 = rootNode.getChildren().get(2); // thrid child of root node
        child3.getChildren().add(new TreeNode<Integer>(7));

        Tree tree = new Tree(rootNode);
        tree.print();

        //      1            -> 0
        //  2   3   4        -> 1
        //5  6     7         -> 2

        //1
        //2 3 4
        //5 6 7
    }
}
