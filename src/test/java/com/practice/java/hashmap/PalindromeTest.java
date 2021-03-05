package com.practice.java.hashmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    void isPalindrome() {
        assertEquals(true, palindrome.isPalindrome("iTopiNonAvevanoNipoti"));
        assertEquals(false, palindrome.isPalindrome("iGattiNonAvevanoCugini"));
    }

    @Test
    void canFormPalindrome() {
        assertEquals(true, palindrome.canFormPalindrome("edified"));
    }
}
