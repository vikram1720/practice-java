package com.practice.java.binarytree;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Slf4j
public final class BTConstructWithInOrderTraversal {

    public static BinaryTreeNode<Integer> constructWithPreOrderTraversal(final List<Integer> inorderTraversal,
            final List<Integer> preOrderTraversal) {
        Map<Integer, Integer> nodeToInorderIdx = IntStream.range(0, inorderTraversal.size())
                                                          .boxed()
                                                          .collect(Collectors.toMap(i -> inorderTraversal.get(i),
                                                                                    i -> i));
        return constructWithPreOrderTraversalHelper(preOrderTraversal, 0, preOrderTraversal.size() - 1, 0,
                                                    inorderTraversal.size() - 1, nodeToInorderIdx);
    }

    private static BinaryTreeNode<Integer> constructWithPreOrderTraversalHelper(final List<Integer> preOrder,
            final int preOrderStart, final int preOrderEnd, final int inorderStart, final int inorderEnd,
            final Map<Integer, Integer> nodeToInorderIdx) {
//        log.info("preS - {} , preE - {}, inS - {}, inE - {}", preOrderStart, preOrderEnd, inorderStart, inorderEnd);
        if (inorderStart > inorderEnd || preOrderStart > preOrderEnd) {
            return null;
        }
        int root = preOrder.get(preOrderStart);
        Integer inOrderIdx = nodeToInorderIdx.get(root);
        int leftSubTreeSize = inOrderIdx - inorderStart;
//        log.info("root - {}, inOrderIdx - {}, leftSubTreeSize {}", root, inOrderIdx, leftSubTreeSize);
        return new BinaryTreeNode<>(root, null, constructWithPreOrderTraversalHelper(preOrder, preOrderStart + 1,
                                                                                     preOrderStart + leftSubTreeSize,
                                                                                     inorderStart, inOrderIdx,
                                                                                     nodeToInorderIdx),
                                    constructWithPreOrderTraversalHelper(preOrder, preOrderStart + leftSubTreeSize + 1,
                                                                         preOrderEnd, inOrderIdx + 1, inorderEnd,
                                                                         nodeToInorderIdx));
    }

    public static BinaryTreeNode<Integer> constructWithPostOrderTraversal(final List<Integer> inorderTraversal,
            final List<Integer> postOrderTraversal) {
        Map<Integer, Integer> nodeToInorderIdx = IntStream.range(0, inorderTraversal.size())
                                                          .boxed()
                                                          .collect(Collectors.toMap(i -> inorderTraversal.get(i),
                                                                                    i -> i));
        return constructWithPostOrderTraversalHelper(postOrderTraversal, 0, postOrderTraversal.size() - 1, 0,
                                                    inorderTraversal.size() - 1, nodeToInorderIdx);
    }

    private static BinaryTreeNode<Integer> constructWithPostOrderTraversalHelper(final List<Integer> postOrder,
            final int postOrderStart, final int postOrderEnd, final int inorderStart, final int inorderEnd,
            final Map<Integer, Integer> nodeToInorderIdx) {
//                log.info("preS - {} , preE - {}, inS - {}, inE - {}", postOrderStart, postOrderEnd, inorderStart, inorderEnd);
        if (inorderStart > inorderEnd || postOrderStart > postOrderEnd) {
            return null;
        }
        int root = postOrder.get(postOrderEnd);
        Integer inOrderIdx = nodeToInorderIdx.get(root);
        int leftSubTreeSize = inOrderIdx - inorderStart;
//                log.info("root - {}, inOrderIdx - {}, leftSubTreeSize {}", root, inOrderIdx, leftSubTreeSize);
        return new BinaryTreeNode<>(root, null, constructWithPostOrderTraversalHelper(postOrder, postOrderStart,
                                                                                     postOrderStart + leftSubTreeSize - 1,
                                                                                     inorderStart, inOrderIdx,
                                                                                     nodeToInorderIdx),
                                    constructWithPostOrderTraversalHelper(postOrder, postOrderStart + leftSubTreeSize,
                                                                         postOrderEnd - 1, inOrderIdx + 1, inorderEnd,
                                                                         nodeToInorderIdx));
    }

    private BTConstructWithInOrderTraversal() {
        throw new UnsupportedOperationException();
    }
}
