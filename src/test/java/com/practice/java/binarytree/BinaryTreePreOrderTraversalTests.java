package com.practice.java.binarytree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreePreOrderTraversalTests {

    @Test
    void preOrderTraversalS1WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(314, 6, 271, 28, 0, 561, 3, 17, 6, 2, 1, 401, 641, 257, 271, 28);
        List<Integer> actualResult = BTPreOrderTraversalUtils.preOrderTraversalWithoutParent(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS2WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(1,2,4,5,3);
        List<Integer> actualResult = BTPreOrderTraversalUtils.preOrderTraversalWithoutParent(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS3WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS3();
        List<Integer> expectedResult = List.of(1, 2, 4, 8, 5, 3, 6, 9, 10, 7);
        List<Integer> actualResult = BTPreOrderTraversalUtils.preOrderTraversalWithoutParent(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS1Test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(314, 6, 271, 28, 0, 561, 3, 17, 6, 2, 1, 401, 641, 257, 271, 28);
        List<Integer> actualResult = BTPreOrderTraversalUtils.preOrderTraversal(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS2Test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(1,2,4,5,3);
        List<Integer> actualResult = BTPreOrderTraversalUtils.preOrderTraversal(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS3Test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS3();
        List<Integer> expectedResult = List.of(1, 2, 4, 8, 5, 3, 6, 9, 10, 7);
        List<Integer> actualResult = BTPreOrderTraversalUtils.preOrderTraversal(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS1Test_withStack() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(314, 6, 271, 28, 0, 561, 3, 17, 6, 2, 1, 401, 641, 257, 271, 28);
        List<Integer> actualResult = BTPreOrderTraversalUtils.preOrderTraversalWithStack(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS2Test_withStack() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(1,2,4,5,3);
        List<Integer> actualResult = BTPreOrderTraversalUtils.preOrderTraversalWithStack(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS3Test_withStack() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS3();
        List<Integer> expectedResult = List.of(1, 2, 4, 8, 5, 3, 6, 9, 10, 7);
        List<Integer> actualResult = BTPreOrderTraversalUtils.preOrderTraversalWithStack(root);
        assertEquals(expectedResult, actualResult);
    }
}
