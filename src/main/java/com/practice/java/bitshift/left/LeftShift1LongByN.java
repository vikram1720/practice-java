package com.practice.java.bitshift.left;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LeftShift1LongByN {

    private static void leftShift1LongByN() {
        log.info("1L       = {}", Long.toBinaryString(1L));
        log.info("1L << 1  = {}", Long.toBinaryString(1L << 1));
        log.info("1L << 5  = {}", Long.toBinaryString(1L << 5));
        log.info("1L << 10 = {}", Long.toBinaryString(1L << 10));
        log.info("1L << 20 = {}", Long.toBinaryString(1L << 20));
        log.info("1L << 63 = {}", Long.toBinaryString(1L << 63));
        log.info("1L << 64 = {}", Long.toBinaryString(1L << 64));
    }

    public static void main(String[] args) {
        log.info("LeftShift1LongByN");
        leftShift1LongByN();
    }
}
