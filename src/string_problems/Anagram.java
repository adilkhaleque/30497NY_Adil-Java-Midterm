package string_problems;

import java.util.Arrays;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here

    public static boolean isAnagram(String one, String two) {
        one = one.toLowerCase();
        two = two.toLowerCase();

        if (one.length() == two.length()) {

            char[] arrayOne = one.toCharArray();
            char[] arrayTwo = two.toCharArray();

            Arrays.sort(arrayOne);
            Arrays.sort(arrayTwo);

            if (Arrays.equals(arrayOne, arrayTwo)) {
                System.out.println(one + " and " + two + " are anagrams!");
                return true;
            }
        }

        System.out.println(one + " and " + two + " are NOT anagrams!");
        return false;

    }
}
