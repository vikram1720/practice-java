package com.practice.java.binarytree;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@NoArgsConstructor
public class BTConstructWithPreOrderTraversalWithNull {

    private int index;

    public BinaryTreeNode<Integer> construct(List<Integer> preOrderTraversal) {
        this.index = 0;
        return constructHelper(preOrderTraversal);
    }

    private BinaryTreeNode<Integer> constructHelper(List<Integer> preOrderTraversal) {
        Integer data = preOrderTraversal.get(index);
        index++;
        if (data == null) {
            return null;
        }
        return new BinaryTreeNode<>(data, null, constructHelper(preOrderTraversal),
                                    constructHelper(preOrderTraversal));

    }
}
