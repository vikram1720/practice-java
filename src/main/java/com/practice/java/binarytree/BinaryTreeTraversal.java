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

    public static void inOrderTraversal(final BinaryTreeNode<Integer> node, final List<Integer> traversalData) {
        if (node != null) {
            BinaryTreeNode<Integer> root = node;
            boolean leftDone = false;
            while (root != null) {
                if (!leftDone) {
                    while (root.getLeft() != null) {
                        root = root.getLeft();
                    }
                }
                traversalData.add(root.getData());
                leftDone = true;
                // if right child exists
                if (root.getRight() != null) {
                    leftDone = false;
                    root = root.getRight();
                } else if (root.getParent() != null) { // no right child, then move to parent
                    while (root.getParent() != null && root == root.getParent()
                                                                   .getRight()) {
                        root = root.getParent();
                    }
                    // if root is tree root then exit.
                    if (root.getParent() == null) {
                        break;
                    } else {
                        root = root.getParent();
                    }
                } else {
                    break;
                }
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

    public static void preOrderTraversal(final BinaryTreeNode<Integer> node, final List<Integer> traversalData) {
        if (node != null) {
            BinaryTreeNode<Integer> root = node;
            boolean leftDone = false;
            while (root != null) {
                traversalData.add(root.getData());
                if (!leftDone && root.getLeft() != null) {
                    root = root.getLeft();
                    leftDone = false;
                }
                if (root.getLeft() == null) {
                    leftDone = true;
                }
            }
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
