package com.practice.java.string;

public final class StringUtils {

    public static String toString(int x) {
        if (x == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }
        x = Math.abs(x);
        while (x != 0) {
            sb.append((char) x % 10);
            x = x / 10;
        }
        return sb.append(isNegative ? '-' : "")
                 .reverse()
                 .toString();
    }

    public static int toInteger(String value) {
        int x = value.charAt(0) == '-' ? -1 : 1;
        return x * value.substring((value.charAt(0) == '-' || value.charAt(0) == '+') ? 1 : 0)
                        .chars()
                        .reduce(0, (i, c) -> i * 10 + c - '0');
    }

    private StringUtils() {
        throw new UnsupportedOperationException();
    }
}
