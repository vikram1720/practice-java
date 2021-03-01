package com.practice.java.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
class BTHeightBalancedTest {

    @Test
    void isHeightBalancedTreeTests() {
        BinaryTreeNode<String> data = BTSampleDataUtils.prepareTreeS4();
        assertTrue(BinaryTreeUtils.isHeightBalancedTree(data));
    }
}
