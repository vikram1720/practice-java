package com.practice.java.binarytree;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BinaryTreeNode<T> {

    private T data;

    private BinaryTreeNode<T> parent;

    private BinaryTreeNode<T> left;

    private BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.setData(data);
    }

    public void setLeft(final BinaryTreeNode<T> left) {
        if (left != null) {
            this.left = left;
            left.setParent(this);
        }
    }

    public void setRight(final BinaryTreeNode<T> right) {
        if (right != null) {
            this.right = right;
            right.setParent(this);
        }
    }
}
