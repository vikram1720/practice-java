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

    public static BinaryTreeNode<Integer> prepareTreeS3() {
        BinaryTreeNode<Integer> d = BinaryTreeDataUtils.prepareNode(4, 8, null);
        BinaryTreeNode<Integer> e = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> b = BinaryTreeDataUtils.prepareNode(2, d, e);

        BinaryTreeNode<Integer> f = BinaryTreeDataUtils.prepareNode(6, 9, 10);
        BinaryTreeNode<Integer> g = new BinaryTreeNode<>(7);
        BinaryTreeNode<Integer> c = BinaryTreeDataUtils.prepareNode(3, f, g);

        return BinaryTreeDataUtils.prepareNode(1, b, c);
    }


    // fig 9.2. in EP Java.
    public static BinaryTreeNode<String> prepareTreeS4() {
        BinaryTreeNode<String> d = BinaryTreeDataUtils.prepareNode("d", "e", "f");
        BinaryTreeNode<String> g = new BinaryTreeNode<>("g");
        BinaryTreeNode<String> c = BinaryTreeDataUtils.prepareNode("c", d, g);

        BinaryTreeNode<String> h = BinaryTreeDataUtils.prepareNode("h", "i", "j");

        BinaryTreeNode<String> b = BinaryTreeDataUtils.prepareNode("b", c, h);

        BinaryTreeNode<String> l = BinaryTreeDataUtils.prepareNode("l", "m", "n");
        BinaryTreeNode<String> k = BinaryTreeDataUtils.prepareNode("k", l, new BinaryTreeNode<>("o"));

        return BinaryTreeDataUtils.prepareNode("a", b, k);
    }

    private BTSampleDataUtils() {

    }
}
