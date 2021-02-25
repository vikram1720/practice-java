package com.practice.java.binarytree;

import lombok.Builder;

import java.util.List;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
@Builder
public final class BinaryTreeTraversal {

    public static void inOrderTraversalWithoutParent(final BinaryTreeNode<Integer> root,
            final List<Integer> traversalData) {
        if (root != null) {
            inOrderTraversalWithoutParent(root.getLeft(), traversalData);
            traversalData.add(root.getData());
            inOrderTraversalWithoutParent(root.getRight(), traversalData);
        }
    }

    public static void inOrderTraversal(final BinaryTreeNode<Integer> root,
            final List<Integer> traversalData) {
        if (root != null) {
            BinaryTreeNode<Integer> left = null;
            while(root.getLeft() != null) {
                left = root.getLeft();
            }



        }
    }

    public static void preOrderTraversalWithoutParent(final BinaryTreeNode<Integer> root,
            final List<Integer> traversalData) {
        if (root != null) {
            traversalData.add(root.getData());
            preOrderTraversalWithoutParent(root.getLeft(), traversalData);
            preOrderTraversalWithoutParent(root.getRight(), traversalData);
        }
    }

    public static void postOrderTraversalWithoutParent(final BinaryTreeNode<Integer> root,
            final List<Integer> traversalData) {
        if (root != null) {
            postOrderTraversalWithoutParent(root.getLeft(), traversalData);
            postOrderTraversalWithoutParent(root.getRight(), traversalData);
            traversalData.add(root.getData());
        }
    }

    private BinaryTreeTraversal() {
        throw new UnsupportedOperationException();
    }
}
