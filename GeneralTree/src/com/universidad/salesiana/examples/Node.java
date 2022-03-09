package com.universidad.salesiana.examples;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    private T data;
    private List<Node<T>> children;

    public Node(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public Node(T data, List<Node<T>> children) {
        this.data = data;
        this.children = children;
    }

    public T getData() {
        return this.data;
    }

    public List<Node<T>> getChildren() {
        return this.children;
    }

    public void setData(T data) {
        this.data = data;
    }
}