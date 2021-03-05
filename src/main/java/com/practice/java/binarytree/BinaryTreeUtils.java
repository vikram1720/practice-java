package com.practice.java.binarytree;

public final class BinaryTreeUtils {

    public static <T> boolean isHeightBalancedTree(final BinaryTreeNode<T> node) {
        return isHeightBalanced(node).isBalanced();
    }

    private static <T> BTHeightWithBalancedStatus isHeightBalanced(final BinaryTreeNode<T> node) {
        if (node == null) {
            return new BTHeightWithBalancedStatus(-1, true);
        }
        BTHeightWithBalancedStatus leftTree = isHeightBalanced(node.getLeft());
        if (!leftTree.isBalanced()) {
            return leftTree;
        }
        BTHeightWithBalancedStatus rightTree = isHeightBalanced(node.getRight());
        if (!rightTree.isBalanced()) {
            return rightTree;
        }
        boolean isBalanced = Math.abs(leftTree.getHeight() - rightTree.getHeight()) <= 1;
        int height = Math.max(leftTree.getHeight(), rightTree.getHeight()) + 1;
        return new BTHeightWithBalancedStatus(height, isBalanced);
    }

    private BinaryTreeUtils() {
        throw new UnsupportedOperationException();
    }
}
