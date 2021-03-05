package com.practice.java.binarytree;

import java.util.ArrayList;
import java.util.List;

public final class BinaryTreeLeavesUtils {

    public static <T> List<T> leavesLeftToRight(final BinaryTreeNode<T> node) {
        List<T> result = new ArrayList<>();
        leavesHelper(node, result);
        return result;
    }

    private static <T> void leavesHelper(final BinaryTreeNode<T> node, final List<T> result) {
        if (node == null) {
            return;
        }
        if (node.getLeft() == null && node.getRight() == null) {
            result.add(node.getData());
        } else {
            leavesHelper(node.getLeft(), result);
            leavesHelper(node.getRight(), result);
        }
    }

    private BinaryTreeLeavesUtils() {
        throw new UnsupportedOperationException();
    }
}
