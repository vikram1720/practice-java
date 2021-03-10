package com.practice.java.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpreadSheetEncodingUtilsTest {

    @Test
    void testToString() {
        assertEquals("ZZ", SpreadSheetEncodingUtils.toString(702));
        assertEquals("AA", SpreadSheetEncodingUtils.toString(27));
        assertEquals("D", SpreadSheetEncodingUtils.toString(4));
    }

    @Test
    void toInteger() {
        assertEquals(702, SpreadSheetEncodingUtils.toInteger("ZZ"));
        assertEquals(27, SpreadSheetEncodingUtils.toInteger("AA"));
        assertEquals(4, SpreadSheetEncodingUtils.toInteger("D"));
    }
}
