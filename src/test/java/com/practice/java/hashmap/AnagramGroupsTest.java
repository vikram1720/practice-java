package com.practice.java.hashmap;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class AnagramGroupsTest {

    private AnagramGroups anagramGroups;

    private List<String> input1;

    @BeforeEach
    void setUp() {
        anagramGroups = new AnagramGroups();
        input1 = List.of("debitcard", "elvis", "silent", "badcredit", "lives", "freedom", "listen", "levis", "money");
    }

    @Test
    void findAnagramGroupsImp1() {
        List<List<String>> result = anagramGroups.findAnagramGroupsImp1(input1);
        log.info("findAnagramGroupsImp1 {}", result);
        assertEquals(3, result.size());
    }

    @Test
    void findAnagramGroupsImp2() {
        List<List<String>> result = anagramGroups.findAnagramGroupsImp2(input1);
        log.info("findAnagramGroupsImp2 {}", result);
        assertEquals(3, result.size());
    }
}
