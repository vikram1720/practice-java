package com.practice.java.binarytree;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.TreeMap;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BinaryTreeNode<T> extends TreeMap<T, BinaryTreeNode<T>> {

    private T data;

    private BinaryTreeNode<T> parent;

    private BinaryTreeNode<T> left;

    private BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.setData(data);
    }
}
