package com.practice.java.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class SpreadSheetEncodingUtils {

    public static int toInteger(String value) {
        return value.chars()
                    .reduce(0, (result, c) -> result * 26 + c - 'A' + 1);
    }

    public static String toString(int x) {
        if (x == 0) {
            return "A";
        }
        StringBuilder sb = new StringBuilder();
        while (x != 0) {
            sb.append((char) ('A' + ((x - 1) % 26)));
            x = (x - 1) / 26;
        }
        return sb.toString();
    }

    public SpreadSheetEncodingUtils() {
        throw new UnsupportedOperationException();
    }
}
