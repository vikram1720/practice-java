package com.practice.java.binarytree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
class BinaryTreeLeavesUtilsTest {

    @Test
    void leavesLeftToRight_sample1_test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS1();
        List<Integer> expectedResult = List.of(28, 0, 17, 641, 257, 28);
        List<Integer> actualResult = BinaryTreeLeavesUtils.leavesLeftToRight(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void leavesLeftToRight_sample3_test() {
        BinaryTreeNode<Integer> root = BTSampleDataUtils.prepareTreeS3();
        List<Integer> expectedResult = List.of(8, 5, 9, 10, 7);
        List<Integer> actualResult = BinaryTreeLeavesUtils.leavesLeftToRight(root);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void leavesLeftToRight_sample4_test() {
        BinaryTreeNode<String> root = BTSampleDataUtils.prepareTreeS4();
        List<String> expectedResult = List.of("e", "f", "g", "i", "j", "m", "n", "o");
        List<String> actualResult = BinaryTreeLeavesUtils.leavesLeftToRight(root);
        assertEquals(expectedResult, actualResult);
    }
}
