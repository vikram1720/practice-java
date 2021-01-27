package com.practice.java.binarysearch;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BinarySearch {

    public int search(int key, List<Integer> values) {
        int low = 0;
        int high = values.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (values.get(mid) < key) {
                low = mid + 1;
            } else if (values.get(mid) == key) {
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int searchFirstOccurrenceOfKey(int key, List<Integer> values) {
        int result = -1;
        int low = 0;
        int high = values.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (values.get(mid) < key) {
                low = mid + 1;
            } else if (values.get(mid) == key) {
                result = mid;
                high = mid - 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public int firstElementGreaterThanKeyIndex(int key, List<Integer> values) {
        int result = -1;
        int low = 0;
        int high = values.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (values.get(mid) <= key) {
                low = mid + 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }
}
