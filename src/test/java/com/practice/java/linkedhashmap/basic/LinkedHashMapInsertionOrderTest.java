package com.practice.java.linkedhashmap.basic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
public class LinkedHashMapInsertionOrderTest {

    @Test
    void linkedHashMapIOrder() {
        Map<String, String> values = new LinkedHashMap<>();
        values.put("A", "ABC");
        values.put("Z", "ZBC");
        values.put("a", "abc");
        values.put("b", "bbc");
        // prints in order - A, Z, a, b
        values.forEach((key, value) -> log.info("{} - {}", key, value));
    }

    @Test
    void linkedHashMapIOrderWithDelete() {
        Map<String, String> values = new LinkedHashMap<>();
        values.put("A", "ABC");
        values.put("Z", "ZBC");
        values.put("a", "abc");
        values.put("b", "bbc");
        values.remove("Z");
        // prints in order - A, a, b
        values.forEach((key, value) -> log.info("{} - {}", key, value));
    }

    @Test
    void linkedHashMapIOrderWithMultiplePut() {
        Map<String, String> values = new LinkedHashMap<>();
        values.put("A", "ABC");
        values.put("Z", "ZBC");
        values.put("a", "abc");
        values.put("Z", "MBC");
        values.put("b", "bbc");
        // prints in order - A, Z, a, b
        values.forEach((key, value) -> log.info("{} - {}", key, value));
    }
}
