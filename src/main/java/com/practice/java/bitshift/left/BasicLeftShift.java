package com.practice.java.bitshift.left;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BasicLeftShift {

    /**
     * always appends '0' to right side after shifting to left
     */
    private static void basic() {
        log.info("2      = {}", Integer.toBinaryString(2));
        log.info("2 << 1 = {}", Integer.toBinaryString(2 << 1));
        log.info("2 << 5 = {}", Integer.toBinaryString(2 << 5));
        log.info("1234567      = {}", Integer.toBinaryString(1234567));
        log.info("1234567 << 1 = {}", Integer.toBinaryString(1234567 << 1));
        log.info("1234567 << 4 = {}", Integer.toBinaryString(1234567 << 4));
        log.info("-2      = {}", Integer.toBinaryString(-2));
        log.info("-2 << 1 = {}", Integer.toBinaryString(-2 << 1));
        log.info("-2 << 5 = {}", Integer.toBinaryString(-2 << 5));
    }

    public static void main(String[] args) {
        log.info("Basic Left Shift!");
        basic();
    }
}
