package com.practice.java.basic.collections;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
public class CollectionsTest {

    @Test
    void test_rotate_by_positive() {
        List<Integer> value = Arrays.asList(0,1,2,3,4);
        int rotateBy = 2;
        Collections.rotate(value, rotateBy);
        log.info("rotate by {} {}",rotateBy, value);
    }

    @Test
    void test_rotate_by_negative() {
        List<Integer> value = Arrays.asList(0,1,2,3,4);
        int rotateBy = -2;
        Collections.rotate(value, rotateBy);
        log.info("rotate by {} {}",rotateBy, value);
    }

    @Test
    void test_rotate_by_zero() {
        List<Integer> value = Arrays.asList(0,1,2,3,4);
        Collections.rotate(value, 0);
        log.info("rotate by 0 {}", value);
    }
}
