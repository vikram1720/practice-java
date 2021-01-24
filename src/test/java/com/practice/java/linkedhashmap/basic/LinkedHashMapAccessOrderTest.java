package com.practice.java.linkedhashmap.basic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Invoking the put, putIfAbsent, get, getOrDefault, compute, computeIfAbsent, computeIfPresent, or merge
 * will create access entry
 *
 * putAll creates one access entry
 *
 * replace - one entry only if the value is replaced
 *
 */
@Slf4j
public class LinkedHashMapAccessOrderTest {

    @Test
    void linkedHashMapAccessOrder() {
        // constructor
        // 1 - access order
        // 0 - insertion order
        Map<String, String> values = new LinkedHashMap<>(4, 1, true);
        values.put("A", "ABC");
        values.put("Z", "ZBC");
        values.put("a", "abc");
        values.put("b", "bbc");
        values.get("a");
        values.put("Z", "MBC");
        values.get("a");
        // prints least to max accessed element - A, b, Z, a
        values.forEach((key, value) -> log.info("{} - {}", key, value));
    }
}
