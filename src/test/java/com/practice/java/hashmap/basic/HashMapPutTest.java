package com.practice.java.hashmap.basic;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author <a href="mailto:vikram.sundar@castandcrew.com">Vikram Sundar Subbiah</a>
 */
public class HashMapPutTest {

    @Test
    void putReturnPreviousValueTest() {
        Map<String, Integer> result = new HashMap<>();
        assertEquals(null, result.put("a", 1));
        assertEquals(1, result.put("a", 2));
        assertEquals(2, result.put("a", 3));
    }
}
