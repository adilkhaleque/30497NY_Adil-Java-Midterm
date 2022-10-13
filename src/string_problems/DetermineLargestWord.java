package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    /** INSTRUCTIONS
     * Implement a solution to find the length of the longest word in the given sentence below
     * Your solution should return a map containing the length of the word as the key & the word itself as the value
     * "10: biological"
     */

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //System.out.println(wordNLength);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        // Implement here
        String[] splitSentence = wordGiven.split(" ");
        for (String s : splitSentence) {
            if (s.length() >= st.length()) {
                st = s;
            }
        }
//        for (int i = 0; i < splitSentence.length; i++) {
//            if (splitSentence[i].length() >= st.length()) {
//                st = splitSentence[i];
//            }
//        }
        map.put(st.length(), st);
        System.out.println(st.length() + ": " + st);
        return map;
    }
}
