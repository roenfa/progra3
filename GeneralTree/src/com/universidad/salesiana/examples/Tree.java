package com.universidad.salesiana.examples;

import java.util.LinkedList;
import java.util.Queue;

public class Tree<T> {
    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public void drawLevelOrder(){
        if(this.root == null) return;

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(this.root);

        while(!queue.isEmpty()) {
            int len = queue.size();
            for(var i = 0; i < len; i++) { // so that we can reach each level
                Node<T> currentNode = queue.remove();
                System.out.print(currentNode.getData() + " ");
                queue.addAll(currentNode.getChildren());
            }

            System.out.println();
        }
    }
}
