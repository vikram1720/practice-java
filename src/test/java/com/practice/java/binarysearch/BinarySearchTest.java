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
    void firstElementGreaterThanKeyTest() {
        assertEquals(1, binarySearch.firstElementGreaterThanKeyIndex(-13, values));
        assertEquals(9, binarySearch.firstElementGreaterThanKeyIndex(285, values));
        assertEquals(-1, binarySearch.firstElementGreaterThanKeyIndex(500, values));
        assertEquals(5, binarySearch.firstElementGreaterThanKeyIndex(108, values));
    }

    @Test
    void localMinimumIndexTest() {
        List<Integer> input1 = List.of(9, 6, 3, 14, 5, 7, 4);
        assertEquals(2, binarySearch.findLocalMinimumIndex(input1, 0, input1.size() - 1));
        List<Integer> input2 = List.of(23, 8, 15, 2, 3);
        assertEquals(1, binarySearch.findLocalMinimumIndex(input2, 0, input2.size() - 1));
        List<Integer> input3 = List.of(1, 2, 3);
        assertEquals(0, binarySearch.findLocalMinimumIndex(input3, 0, input3.size() - 1));
        List<Integer> input4 = List.of(3, 2, 1);
        assertEquals(2, binarySearch.findLocalMinimumIndex(input4, 0, input4.size() - 1));
    }

    @Test
    void findMinimumInCyclicallySortedArray() {
        List<Integer> input1 = List.of(378, 478, 550, 631, 103, 203, 220, 234, 279, 368);
        assertEquals(103, binarySearch.findMinimumInCyclicallySortedArray(input1));
        List<Integer> input2 = List.of(378, 478, 550, 631, 103, 203);
        assertEquals(103, binarySearch.findMinimumInCyclicallySortedArray(input2));
    }
}
