package com.practice.java.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testToString() {
        assertEquals("123", StringUtils.toString(123));
        assertEquals("-123", StringUtils.toString(-123));
        assertEquals("0", StringUtils.toString(0));
    }

    @Test
    void testToInteger() {
        assertEquals(123, StringUtils.toInteger("123"));
        assertEquals(-123, StringUtils.toInteger("-123"));
        assertEquals(0, StringUtils.toInteger("0"));
    }
}
