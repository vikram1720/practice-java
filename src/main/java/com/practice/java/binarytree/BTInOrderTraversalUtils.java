package com.practice.java.binarytree;

import com.practice.java.binarytree.pojo.BTNodeAndTraversalState;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public final class BTInOrderTraversalUtils {

    public static List<Integer> inOrderTraversalWithoutParent(final BinaryTreeNode<Integer> root) {
        List<Integer> traversalData = new ArrayList<>();
        inOrderTraversalWithoutParentHelper(root, traversalData);
        return traversalData;
    }

    private static void inOrderTraversalWithoutParentHelper(final BinaryTreeNode<Integer> root,
            final List<Integer> traversalData) {
        if (root != null) {
            inOrderTraversalWithoutParentHelper(root.getLeft(), traversalData);
            traversalData.add(root.getData());
            inOrderTraversalWithoutParentHelper(root.getRight(), traversalData);
        }
    }

    public static List<Integer> inOrderTraversal(final BinaryTreeNode<Integer> node) {
        List<Integer> traversalData = new ArrayList<>();
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
        return traversalData;
    }

    public static List<Integer> inOrderTraversalWithStack(final BinaryTreeNode<Integer> root) {
        List<Integer> traversalData = new ArrayList<>();
        if (root != null) {
            Deque<BTNodeAndTraversalState> stack = new ArrayDeque<>();
            stack.addFirst(new BTNodeAndTraversalState(false, root));
            while (!stack.isEmpty()) {
                BTNodeAndTraversalState nodeState = stack.removeFirst();
                BinaryTreeNode<Integer> node = nodeState.getNode();
                if (node != null) {
                    if (nodeState.isProcessed()) {
                        traversalData.add(nodeState.getNode()
                                                   .getData());
                    } else {
                        stack.addFirst(new BTNodeAndTraversalState(false, node.getRight()));
                        nodeState.setProcessed(true);
                        stack.addFirst(nodeState);
                        stack.addFirst(new BTNodeAndTraversalState(false, node.getLeft()));
                    }
                }
            }
        }
        return traversalData;
    }

    private BTInOrderTraversalUtils() {
        throw new UnsupportedOperationException();
    }
}
