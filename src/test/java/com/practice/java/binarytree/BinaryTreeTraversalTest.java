package com.practice.java.binarytree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
class BinaryTreeTraversalTest {

    @Test
    void inOrderTraversalWithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTree();
        List<Integer> expectedResult = List.of(28, 271, 0, 6, 561, 17, 3, 314, 2, 401, 641, 1, 257, 6, 271, 28);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.inOrderTraversalWithoutParent(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTree();
        List<Integer> expectedResult = List.of(28, 271, 0, 6, 561, 17, 3, 314, 2, 401, 641, 1, 257, 6, 271, 28);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.inOrderTraversal(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalWithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTree();
        List<Integer> expectedResult = List.of(314, 6, 271, 28, 0, 561, 3, 17, 6, 2, 1, 401, 641, 257, 271, 28);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.preOrderTraversalWithoutParent(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void postOrderTraversalWithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTree();
        List<Integer> expectedResult = List.of(28, 0, 271, 17, 3, 561, 6, 641, 401, 257, 1, 2, 28, 271, 6, 314);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.postOrderTraversalWithoutParent(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }
}