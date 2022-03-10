package com.universidad.salesiana.examples;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    private T data; // Value of tree node -> Key
    private List<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setChildren(List<TreeNode<T>> children) {
        this.children = children;
    }
}
