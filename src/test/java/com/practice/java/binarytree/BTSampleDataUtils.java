package com.practice.java.binarytree;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
public final class BTSampleDataUtils {

    public static BinaryTreeNode<Integer> prepareTreeS1() {
        BinaryTreeNode<Integer> c = BinaryTreeDataUtils.prepareNode(271,28,0);
        BinaryTreeNode<Integer> g = BinaryTreeDataUtils.prepareNode(3,17,null);
        BinaryTreeNode<Integer> f = BinaryTreeDataUtils.prepareNode(561, null, g);
        BinaryTreeNode<Integer> b = BinaryTreeDataUtils.prepareNode(6, c, f);

        BinaryTreeNode<Integer> l = BinaryTreeDataUtils.prepareNode(401, null, 641);
        BinaryTreeNode<Integer> n = new BinaryTreeNode<>(257);
        BinaryTreeNode<Integer> k = BinaryTreeDataUtils.prepareNode(1, l, n);
        BinaryTreeNode<Integer> j = BinaryTreeDataUtils.prepareNode(2, null, k);

        BinaryTreeNode<Integer> o = BinaryTreeDataUtils.prepareNode(271,null,28);
        BinaryTreeNode<Integer> i = BinaryTreeDataUtils.prepareNode(6, j, o);

        return BinaryTreeDataUtils.prepareNode(314, b, i);

    }

    public static BinaryTreeNode<Integer> prepareTreeS2() {
        BinaryTreeNode<Integer> b = BinaryTreeDataUtils.prepareNode(2,4,5);
        BinaryTreeNode<Integer> c = BinaryTreeDataUtils.prepareNode(3,null,null);
        return BinaryTreeDataUtils.prepareNode(1, b, c);
    }

    private BTSampleDataUtils() {

    }
}
