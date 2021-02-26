package com.practice.java.binarytree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
public class BinaryTreePreOrderTraversalTests {

    @Test
    void preOrderTraversalS1WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(314, 6, 271, 28, 0, 561, 3, 17, 6, 2, 1, 401, 641, 257, 271, 28);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.preOrderTraversalWithoutParent(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS2WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(1,2,4,5,3);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.preOrderTraversalWithoutParent(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS1Test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(314, 6, 271, 28, 0, 561, 3, 17, 6, 2, 1, 401, 641, 257, 271, 28);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.preOrderTraversal(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void preOrderTraversalS2Test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(1,2,4,5,3);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.preOrderTraversal(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }
}
