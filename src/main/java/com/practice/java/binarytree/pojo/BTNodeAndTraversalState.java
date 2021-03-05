package com.practice.java.binarytree.pojo;

import com.practice.java.binarytree.BinaryTreeNode;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
@Data
@AllArgsConstructor
public class BTNodeAndTraversalState {

    private boolean isProcessed;

    private BinaryTreeNode<Integer> node;
}
