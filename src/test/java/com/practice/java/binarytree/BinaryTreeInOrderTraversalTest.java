package com.practice.java.binarytree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeInOrderTraversalTest {

    @Test
    void inOrderTraversalS1WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(28, 271, 0, 6, 561, 17, 3, 314, 2, 401, 641, 1, 257, 6, 271, 28);
        List<Integer> actualResult = BTInOrderTraversalUtils.inOrderTraversalWithoutParent(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS2WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(4, 2, 5, 1, 3);
        List<Integer> actualResult = BTInOrderTraversalUtils.inOrderTraversalWithoutParent(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS3WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS3();
        List<Integer> expectedResult = List.of(8, 4, 2, 5, 1, 9, 6, 10, 3, 7);
        List<Integer> actualResult = BTInOrderTraversalUtils.inOrderTraversalWithoutParent(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS1Test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(28, 271, 0, 6, 561, 17, 3, 314, 2, 401, 641, 1, 257, 6, 271, 28);
        List<Integer> actualResult = BTInOrderTraversalUtils.inOrderTraversal(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS2Test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(4, 2, 5, 1, 3);
        List<Integer> actualResult = BTInOrderTraversalUtils.inOrderTraversal(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS3Test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS3();
        List<Integer> expectedResult = List.of(8, 4, 2, 5, 1, 9, 6, 10, 3, 7);
        List<Integer> actualResult = BTInOrderTraversalUtils.inOrderTraversal(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS1_withStack() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(28, 271, 0, 6, 561, 17, 3, 314, 2, 401, 641, 1, 257, 6, 271, 28);
        List<Integer> actualResult = BTInOrderTraversalUtils.inOrderTraversalWithStack(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS2_withStack() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(4, 2, 5, 1, 3);
        List<Integer> actualResult = BTInOrderTraversalUtils.inOrderTraversalWithStack(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS3_withStack() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS3();
        List<Integer> expectedResult = List.of(8, 4, 2, 5, 1, 9, 6, 10, 3, 7);
        List<Integer> actualResult = BTInOrderTraversalUtils.inOrderTraversalWithStack(root);
        assertEquals(expectedResult, actualResult);
    }
}
