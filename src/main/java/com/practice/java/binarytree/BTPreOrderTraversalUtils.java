package com.practice.java.binarytree;

import com.practice.java.binarytree.pojo.BTNodeAndTraversalState;
import lombok.Builder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

@Builder
public final class BTPreOrderTraversalUtils {

    public static List<Integer> preOrderTraversalWithoutParent(final BinaryTreeNode<Integer> root) {
        List<Integer> traversalData = new ArrayList<>();
        preOrderTraversalWithoutParentHelper(root, traversalData);
        return traversalData;
    }

    private static void preOrderTraversalWithoutParentHelper(final BinaryTreeNode<Integer> root,
            final List<Integer> traversalData) {
        if (root != null) {
            traversalData.add(root.getData());
            preOrderTraversalWithoutParentHelper(root.getLeft(), traversalData);
            preOrderTraversalWithoutParentHelper(root.getRight(), traversalData);
        }
    }

    public static List<Integer> preOrderTraversal(final BinaryTreeNode<Integer> node) {
        List<Integer> traversalData = new ArrayList<>();
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
        return traversalData;
    }

    public static List<Integer> preOrderTraversalWithStack(final BinaryTreeNode<Integer> root) {
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
                    stack.addFirst(new BTNodeAndTraversalState(false, node.getRight()));
                    stack.addFirst(new BTNodeAndTraversalState(false, node.getLeft()));
                    nodeAndTraversalState.setProcessed(true);
                    stack.addFirst(nodeAndTraversalState);
                }
            }
        }
        return traversalData;
    }

    private BTPreOrderTraversalUtils() {
        throw new UnsupportedOperationException();
    }
}
