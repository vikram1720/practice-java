package com.practice.java.hashmap;

import com.practice.java.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGroups {

    /**
     * O(nmlogm)
     * n - no.of values
     * m - no of characters in a value
     */
    public List<List<String>> findAnagramGroupsImp1(final List<String> values) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        for (String value : values) {
            String sortedValue = StringUtils.sorted(value);
            List<String> groupValues = anagramGroups.computeIfAbsent(sortedValue, k -> new ArrayList<>());
            groupValues.add(value);
        }
        return anagramGroups.values()
                            .stream()
                            .filter(e -> e.size() >= 2)
                            .collect(Collectors.toList());
    }

    /**
     * O(nm)
     * n - no.of values
     * m - no of characters in a value
     */
    public List<List<String>> findAnagramGroupsImp2(final List<String> values) {
        Map<Map<Character, Long>, List<String>> anagramGroups = new HashMap<>();
        for (String value : values) {
            // instead of sorted we count the characters in string which takes O(m) per string and O(nm) for all strings
            Map<Character, Long> charCount = StringUtils.countCharacters(value);
            List<String> groupValues = anagramGroups.computeIfAbsent(charCount, k -> new ArrayList<>());
            groupValues.add(value);
        }
        return anagramGroups.values()
                            .stream()
                            .filter(e -> e.size() >= 2)
                            .collect(Collectors.toList());
    }
}
