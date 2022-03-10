package com.universidad.salesiana.examples;

import java.util.LinkedList;
import java.util.Queue;

public class Tree<T> {
    private TreeNode<T> rootNode;

    public Tree(TreeNode<T> rootNode) {
        this.rootNode = rootNode;
    }

    public void print() {
        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(this.rootNode);//1

        // cycle
        while (!queue.isEmpty()) {
            var queueSize = queue.size(); //1
            for (var i = 0; i < queueSize; i++) {
                var currentNode = queue.remove();// queue is empty
                System.out.print(currentNode.getData() + " ");
                queue.addAll(currentNode.getChildren());
            }

            System.out.println();
        }
    }
}
