package com.practice.java.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTHeightBalancedTest {

    @Test
    void isHeightBalancedTreeTests() {
        BinaryTreeNode<String> data = BTSampleDataUtils.prepareTreeS4();
        assertTrue(BinaryTreeUtils.isHeightBalancedTree(data));
    }
}
