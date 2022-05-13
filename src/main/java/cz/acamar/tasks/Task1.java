package cz.acamar.tasks;

import java.util.Arrays;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     *
     * <p>Given a string s consisting of some words separated by some number of spaces, return the
     * length of the last word in the string.
     *
     * <p>A word is a maximal substring consisting of non-space characters only.
     *
     * <p>Example input: "Hello World" Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        if (null == str || str.isBlank()) {
            return 0;
        }

        return Arrays.stream(str.trim().split("\\s"))
                .map(String::trim)
                .filter(value -> value.length() > 0)
                .reduce((first, second) -> second)
                .map(String::length)
                .orElse(0);
    }
}
