package com.practice.java.binarytree.pojo;

import com.practice.java.binarytree.BinaryTreeNode;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BTNodeAndTraversalState {

    private boolean isProcessed;

    private BinaryTreeNode<Integer> node;
}
