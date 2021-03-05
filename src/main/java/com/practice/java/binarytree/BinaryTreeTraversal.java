package com.practice.java.binarytree;

import lombok.Builder;

import java.util.List;

@Builder
public final class BinaryTreeTraversal {


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
            boolean ignoreRoot = false;
            while (root != null) {
                if (!ignoreRoot) {
                    traversalData.add(root.getData());
                }
                if (!leftDone && root.getLeft() != null) {
                    root = root.getLeft();
                    ignoreRoot = false;
                } else if (root.getRight() != null) {
                    root = root.getRight();
                    leftDone = false;
                    ignoreRoot = false;
                } else if (root.getParent() != null) {
                    leftDone = true;
                    while (root.getParent() != null && root == root.getParent()
                                                                   .getRight()) {
                        root = root.getParent();
                    }
                    if (root.getParent() != null) {
                        root = root.getParent();
                        ignoreRoot = true;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }



    private BinaryTreeTraversal() {
        throw new UnsupportedOperationException();
    }
}
