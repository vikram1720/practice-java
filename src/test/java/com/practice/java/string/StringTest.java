package com.practice.java.string;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {

    @Test
    void testSubstring() {
        String value = "abcdefghij";
        assertEquals("defghij", value.substring(3));
        assertEquals("defg", value.substring(3,7));
        assertEquals("", value.substring(10));
    }

    @Test
    void testIndexOf() {
        String value = "abcdabc";
        assertEquals(0, value.indexOf("abc"));
        assertEquals(4, value.lastIndexOf("abc"));
        assertEquals(0, value.indexOf('a'));
        assertEquals(4, value.lastIndexOf('a'));
        assertEquals(-1, value.indexOf('a', 6));
    }
}
