package com.practice.java.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private BinarySearch binarySearch;

    private List<Integer> values;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
        values = List.of(-14, -10, 2, 108, 108, 243, 285, 285, 401);
    }

    @Test
    void binarySearchIndex() {
        assertEquals(5, binarySearch.binarySearchIndex(243, values));
        assertEquals(-1, binarySearch.binarySearchIndex(400, values));
        assertEquals(2, binarySearch.binarySearchIndex(2, values));
    }
}
