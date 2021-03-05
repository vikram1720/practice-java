package com.practice.java.hashmap;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Palindrome {

    public boolean isPalindrome(final String value) {
        Objects.requireNonNull(value);
        String convertedString = value.toLowerCase();
        int i = 0;
        int j = convertedString.length() - 1;
        while (i < j) {
            if (convertedString.charAt(i) != convertedString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean canFormPalindrome(final String value) {
        Objects.requireNonNull(value);
        Set<Character> characterSet = new HashSet<>();
        for (Character ch : value.toCharArray()) {
            if (characterSet.contains(ch)) {
                characterSet.remove(ch);
            } else {
                characterSet.add(ch);
            }
        }
        return characterSet.size() <= 1;
    }
}
