package com.practice.java.binarytree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
class BinaryTreePostOrderTraversalTest {

    @Test
    void postOrderTraversalS1WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(28, 0, 271, 17, 3, 561, 6, 641, 401, 257, 1, 2, 28, 271, 6, 314);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.postOrderTraversalWithoutParent(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void postOrderTraversalS2WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS2();
        List<Integer> expectedResult = List.of(4, 5, 2, 3, 1);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.postOrderTraversalWithoutParent(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void postOrderTraversalS3WithoutParentTest() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS3();
        List<Integer> expectedResult = List.of(8, 4, 5, 2, 9, 10, 6, 7, 3, 1);
        List<Integer> actualResult = new ArrayList<>();
        BinaryTreeTraversal.postOrderTraversalWithoutParent(root, actualResult);
        assertEquals(expectedResult, actualResult);
    }
}
