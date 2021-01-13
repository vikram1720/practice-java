package com.practice.java.bitshift.left;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultiplyBy2 {

    /**
     * A single left shift multiplies the binary number by 2
     */
    private static void multiplyBy2(){
        log.info("2         = {}", Integer.toBinaryString(2));
        log.info("2   << 1  = {} -- {}", Integer.toBinaryString(2 << 1), 2 << 1);
        log.info("2   << 2  = {} -- {}", Integer.toBinaryString(2 << 2), 2 << 2);
        log.info("2   << 3  = {} -- {}", Integer.toBinaryString(2 << 3), 2 << 3);
        log.info("2   << 4  = {} -- {}", Integer.toBinaryString(2 << 4), 2 << 4);
        log.info("2   << 5  = {} -- {}", Integer.toBinaryString(2 << 5), 2 << 5);
        log.info("2   << 6  = {} -- {}", Integer.toBinaryString(2 << 6), 2 << 6);
        log.info("2   << 7  = {} -- {}", Integer.toBinaryString(2 << 7), 2 << 7);
        log.info("2   << 8  = {} -- {}", Integer.toBinaryString(2 << 8), 2 << 8);
        log.info("5         = {}", Integer.toBinaryString(5));
        log.info("5   << 1  = {} -- {}", Integer.toBinaryString(5 << 1), 5 << 1);
        log.info("5   << 2  = {} -- {}", Integer.toBinaryString(5 << 2), 5 << 2);
        log.info("10        = {}", Integer.toBinaryString(10));
        log.info("10  << 1  = {} -- {}", Integer.toBinaryString(10 << 1), 10 << 1);
        log.info("10  << 2  = {} -- {}", Integer.toBinaryString(10 << 2), 10 << 2);
        log.info("100       = {}", Integer.toBinaryString(100));
        log.info("100 << 1  = {} -- {}", Integer.toBinaryString(100 << 1), 100 << 1);
        log.info("100 << 2  = {} -- {}", Integer.toBinaryString(100 << 2), 100 << 2);
    }

    public static void main(String[] args) {
        log.info("MultiplyBy2");
        multiplyBy2();
    }
}
