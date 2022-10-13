package string_problems;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    public static void main(String[] args) {

    }
    // Implement Here
    public static Set<String> computePermutation(String s) {

        Set<String> permutations = new HashSet<>();

        if (s == null)
            return null;
        else if (s.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char myFirstChar = s.charAt(0);

        String substring = s.substring(1);

        Set<String> w = computePermutation(substring);

        for (String str: w) {
            for (int i = 0; i <= str.length(); i++) {
                permutations.add(str.substring(0, i) + myFirstChar + str.substring(i));
            }
        }
        return permutations;
    }
}
