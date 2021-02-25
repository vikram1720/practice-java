package com.practice.java.binarytree;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
public final class BinaryTreeDataUtils {

    public static <T> BinaryTreeNode<T> prepareNode(final T rootData, final T leftData, final T rightData) {
        BinaryTreeNode<T> root = new BinaryTreeNode<>(rootData);
        if (leftData != null) {
            BinaryTreeNode<T> left = new BinaryTreeNode<>(leftData);
            root.setLeft(left);
            left.setParent(root);
        }
        if (rightData != null) {
            BinaryTreeNode<T> right = new BinaryTreeNode<>(rightData);
            root.setRight(right);
            right.setParent(right);
        }
        return root;
    }

    public static <T> BinaryTreeNode<T> prepareNode(final T rootData, final BinaryTreeNode<T> left,
            final BinaryTreeNode<T> right) {
        BinaryTreeNode<T> root = new BinaryTreeNode<>(rootData);
        if (left != null) {
            left.setParent(root);
            root.setLeft(left);
        }
        if (right != null) {
            right.setParent(root);
            root.setRight(right);
        }
        return root;
    }

    private BinaryTreeDataUtils() {

    }
}
