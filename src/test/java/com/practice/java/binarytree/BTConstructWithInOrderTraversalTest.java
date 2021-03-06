package com.practice.java.binarytree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BTConstructWithInOrderTraversalTest {

    @Test
    void constructWithPreOrderTraversal_sample2() {
        List<Integer> expectedInOrder = List.of(4, 2, 5, 1, 3);
        List<Integer> expectedPreOrder = List.of(1,2,4,5,3);
        BinaryTreeNode<Integer> result =
                BTConstructWithInOrderTraversal.constructWithPreOrderTraversal(expectedInOrder, expectedPreOrder);
        List<Integer> actualInOrder = BTInOrderTraversalUtils.inOrderTraversalWithoutParent(result);
        List<Integer> actualPreOrder = BTPreOrderTraversalUtils.preOrderTraversalWithoutParent(result);
        assertEquals(expectedInOrder, actualInOrder);
        assertEquals(expectedPreOrder, actualPreOrder);
    }

    @Test
    void constructWithPreOrderTraversal_sample3() {
        List<Integer> expectedInOrder = List.of(8, 4, 2, 5, 1, 9, 6, 10, 3, 7);
        List<Integer> expectedPreOrder = List.of(1, 2, 4, 8, 5, 3, 6, 9, 10, 7);
        BinaryTreeNode<Integer> result =
                BTConstructWithInOrderTraversal.constructWithPreOrderTraversal(expectedInOrder, expectedPreOrder);
        List<Integer> actualInOrder = BTInOrderTraversalUtils.inOrderTraversalWithoutParent(result);
        List<Integer> actualPreOrder = BTPreOrderTraversalUtils.preOrderTraversalWithoutParent(result);
        assertEquals(expectedInOrder, actualInOrder);
        assertEquals(expectedPreOrder, actualPreOrder);
    }

    @Test
    void constructWithPostOrderTraversal_sample2() {
        List<Integer> expectedInOrder = List.of(4, 2, 5, 1, 3);
        List<Integer> expectedPostOrder = List.of(4, 5, 2, 3, 1);
        BinaryTreeNode<Integer> result =
                BTConstructWithInOrderTraversal.constructWithPostOrderTraversal(expectedInOrder, expectedPostOrder);
        List<Integer> actualInOrder = BTInOrderTraversalUtils.inOrderTraversalWithoutParent(result);
        List<Integer> actualPostOrder = BTPostOrderTraversalUtils.postOrderTraversalWithoutParent(result);
        assertEquals(expectedInOrder, actualInOrder);
        assertEquals(expectedPostOrder, actualPostOrder);
    }

    @Test
    void constructWithPostOrderTraversal_sample3() {
        List<Integer> expectedInOrder = List.of(8, 4, 2, 5, 1, 9, 6, 10, 3, 7);
        List<Integer> expectedPostOrder = List.of(8, 4, 5, 2, 9, 10, 6, 7, 3, 1);
        BinaryTreeNode<Integer> result =
                BTConstructWithInOrderTraversal.constructWithPostOrderTraversal(expectedInOrder, expectedPostOrder);
        List<Integer> actualInOrder = BTInOrderTraversalUtils.inOrderTraversalWithoutParent(result);
        List<Integer> actualPostOrder = BTPostOrderTraversalUtils.postOrderTraversalWithoutParent(result);
        assertEquals(expectedInOrder, actualInOrder);
        assertEquals(expectedPostOrder, actualPostOrder);
    }
}