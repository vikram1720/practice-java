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
        values = List.of(-14, -10, 2, 108, 108, 243, 285, 285, 285, 401);
    }

    @Test
    void binarySearchIndexTest() {
        assertEquals(5, binarySearch.search(243, values));
        assertEquals(-1, binarySearch.search(400, values));
        assertEquals(2, binarySearch.search(2, values));
    }

    @Test
    void binarySearchFirstOfKTest() {
        assertEquals(3, binarySearch.searchFirstOccurrenceOfKey(108, values));
        assertEquals(6, binarySearch.searchFirstOccurrenceOfKey(285, values));
    }

    @Test
    void firstElementGreaterThanKey() {
        assertEquals(1, binarySearch.firstElementGreaterThanKeyIndex(-13, values));
        assertEquals(9, binarySearch.firstElementGreaterThanKeyIndex(285, values));
        assertEquals(-1, binarySearch.firstElementGreaterThanKeyIndex(500, values));
        assertEquals(5, binarySearch.firstElementGreaterThanKeyIndex(108, values));
    }
}
