package com.practice.java.binarytree;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
public final class BinaryTreeDataUtils {

    public static <T> BinaryTreeNode<T> prepareNode(final T rootData, final T leftData, final T rightData) {
        BinaryTreeNode<T> root = new BinaryTreeNode<>(rootData);
        if (leftData != null) {
            root.setLeft(new BinaryTreeNode<>(leftData));
        }
        if (rightData != null) {
            root.setRight(new BinaryTreeNode<>(rightData));
        }
        return root;
    }

    public static <T> BinaryTreeNode<T> prepareNode(final T rootData, final BinaryTreeNode<T> left,
            final BinaryTreeNode<T> right) {
        BinaryTreeNode<T> root = new BinaryTreeNode<>(rootData);
        root.setLeft(left);
        root.setRight(right);
        return root;
    }

    private BinaryTreeDataUtils() {
        throw new UnsupportedOperationException();
    }
}
