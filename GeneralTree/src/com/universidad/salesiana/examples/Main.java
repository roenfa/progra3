package com.universidad.salesiana.examples;

public class Main {
    public static void main(String args[]) {
        Node<Integer> root = new Node<Integer>(1);
        root.getChildren().add(new Node<>(2));
        root.getChildren().add(new Node<>(3));
        root.getChildren().add(new Node<>(4));

        Node<Integer> child1 = root.getChildren().get(0);
        child1.getChildren().add(new Node<>(5));
        child1.getChildren().add(new Node<>(6));

        Node<Integer> child3 = root.getChildren().get(2);
        child3.getChildren().add(new Node<>(7));

        Tree tree = new Tree(root);
        tree.drawLevelOrder();
    }
}
