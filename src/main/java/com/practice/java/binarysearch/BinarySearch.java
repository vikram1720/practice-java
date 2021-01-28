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

    public int findLocalMinimumIndex(List<Integer> values, int low, int high) {
        if (values.size() == 1) {
            return 0;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = values.get(mid);
            // left start index case
            if (mid == 0 && value <= values.get(mid + 1)) {
                return mid;
            }
            // right end index case
            if (mid == values.size() - 1 && value <= values.get(mid - 1)) {
                return mid;
            }
            // local minimum
            if (mid > 0 && mid < values.size() - 1 && value <= values.get(mid - 1) && value <= values.get(mid + 1)) {
                return mid;
            }
            // navigate left to find local minimum
            if (mid > 0 && value > values.get(mid - 1)) {
                return findLocalMinimumIndex(values, low, mid - 1);
            }
            // navigate right to find local minimum
            return findLocalMinimumIndex(values, mid + 1, high);
        }
        return -1;
    }
}
