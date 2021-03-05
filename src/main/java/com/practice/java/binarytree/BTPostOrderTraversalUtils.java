package com.practice.java.binarytree;

import com.practice.java.binarytree.pojo.BTNodeAndTraversalState;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public final class BTPostOrderTraversalUtils {

    public static List<Integer> postOrderTraversalWithoutParent(final BinaryTreeNode<Integer> root) {
        List<Integer> traversalData = new ArrayList<>();
        postOrderTraversalWithoutParentHelper(root, traversalData);
        return traversalData;
    }

    private static void postOrderTraversalWithoutParentHelper(final BinaryTreeNode<Integer> root,
            final List<Integer> traversalData) {
        if (root != null) {
            postOrderTraversalWithoutParentHelper(root.getLeft(), traversalData);
            postOrderTraversalWithoutParentHelper(root.getRight(), traversalData);
            traversalData.add(root.getData());
        }
    }

    public static List<Integer> postOrderTraversal(final BinaryTreeNode<Integer> node) {
        List<Integer> traversalData = new ArrayList<>();
        if (node != null) {
            BinaryTreeNode<Integer> root = node;
            boolean leftDone = false;
            while (root != null) {
                if (!leftDone && root.getLeft() != null) {
                    root = root.getLeft();
                } else if (root.getRight() != null) {
                    root = root.getRight();
                    leftDone = false;
                } else if (root.getParent() != null) {
                    traversalData.add(root.getData());
                    while (root.getParent() != null && root == root.getParent()
                                                                   .getRight()) {
                        root = root.getParent();
                        traversalData.add(root.getData());
                    }
                    if (root.getParent() != null) {
                        root = root.getParent();
                        leftDone = true;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return traversalData;
    }

    public static List<Integer> postOrderTraversalWithStack(final BinaryTreeNode<Integer> root) {
        List<Integer> traversalData = new ArrayList<>();
        Deque<BTNodeAndTraversalState> stack = new ArrayDeque<>();
        stack.addFirst(new BTNodeAndTraversalState(false, root));
        while (!stack.isEmpty()) {
            BTNodeAndTraversalState nodeAndTraversalState = stack.removeFirst();
            BinaryTreeNode<Integer> node = nodeAndTraversalState.getNode();
            if (node != null) {
                if (nodeAndTraversalState.isProcessed()) {
                    traversalData.add(node.getData());
                } else {
                    stack.addFirst(new BTNodeAndTraversalState(true, node));
                    stack.addFirst(new BTNodeAndTraversalState(false, node.getRight()));
                    stack.addFirst(new BTNodeAndTraversalState(false, node.getLeft()));
                }
            }
        }
        return traversalData;
    }

    private BTPostOrderTraversalUtils() {
        throw new UnsupportedOperationException();
    }
}
