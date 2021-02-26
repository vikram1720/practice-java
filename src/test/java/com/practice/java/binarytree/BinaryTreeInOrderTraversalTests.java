package com.practice.java.binarytree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
public class BinaryTreeInOrderTraversalTests {

    @Test
    void inOrderTraversalS1WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(28, 271, 0, 6, 561, 17, 3, 314, 2, 401, 641, 1, 257, 6, 271, 28);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.inOrderTraversalWithoutParent(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS2WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(4, 2, 5, 1, 3);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.inOrderTraversalWithoutParent(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS1Test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(28, 271, 0, 6, 561, 17, 3, 314, 2, 401, 641, 1, 257, 6, 271, 28);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.inOrderTraversal(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void inOrderTraversalS2Test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(4, 2, 5, 1, 3);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.inOrderTraversal(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }
}
