package com.practice.java.list.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SubList {

    @Test
    void subListTest() {
        List<Integer> values = List.of(1, 2, 3);
        int i = 0;
        Assertions.assertEquals(List.of(1), values.subList(i, i + 1));
        Assertions.assertEquals(List.of(1, 2), values.subList(i, i + 2));
    }
}
