package com.practice.java;

import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class StringUtils {

    public static String sorted(final String value) {
        Objects.requireNonNull(value);
        return Stream.of(value.split(""))
                     .sorted()
                     .collect(Collectors.joining());
    }

    public static Map<Character, Long> countCharacters(final String value) {
        Objects.requireNonNull(value);
        return value.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
