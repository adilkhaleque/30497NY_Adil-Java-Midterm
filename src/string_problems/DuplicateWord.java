package string_problems;

public class DuplicateWord {

    /** INSTRUCTIONS
     * Write a java program to find duplicate words and the number of occurrences of those words in the given string.
     * Also, find the average length of all the words
     */

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Implement here
        st = st.toLowerCase();

        String[] splitWords = st.split(" ");
        int length = splitWords.length;

        for (int i = 0; i < length; i++) {
            int duplicates = 1;
            for (int j = i + 1; j < length; j++) {
                if (splitWords[i].equals(splitWords[j])) {
                    duplicates++;
                    splitWords[j] = "visited";
                }
            }
            if (duplicates > 1 && !splitWords[i].equals("visited")) {
                System.out.println(splitWords[i] + ", " + duplicates + " occurrences");
            }
        }
        String noSpaces = st.replace(" ", "");
        int numOfChars = noSpaces.length();
        System.out.println("The average length of all the words is: " + numOfChars / length);
    }
}
