package com.practice.java.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BTConstructWithPreOrderTraversalWithNullTest {

    private BTConstructWithPreOrderTraversalWithNull construct;

    @BeforeEach
    void setUp() {
        construct = new BTConstructWithPreOrderTraversalWithNull();
    }

    @Test
    void constructBTWithNullTraversalData() {
        List<Integer> preOrderWithNull = preparePreOrderTraversalWithNull();
        List<Integer> expectedPreOrder = List.of(1, 2, 4, 8, 5, 3, 6, 9, 10, 7);
        BinaryTreeNode<Integer> root = construct.construct(preOrderWithNull);
        List<Integer> actualResult = BTPreOrderTraversalUtils.preOrderTraversalWithStack(root);
        assertEquals(expectedPreOrder, actualResult);
    }

    private List<Integer> preparePreOrderTraversalWithNull() {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(4);
        result.add(8);
        result.add(null);
        result.add(null);
        result.add(null);
        result.add(5);
        result.add(null);
        result.add(null);
        result.add(3);
        result.add(6);
        result.add(9);
        result.add(null);
        result.add(null);
        result.add(10);
        result.add(null);
        result.add(null);
        result.add(7);
        result.add(null);
        result.add(null);
        return result;
    }
}

