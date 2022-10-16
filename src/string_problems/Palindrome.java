package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome("MOB"));
    }

    // Implement here
    public static boolean isPalindrome(String s) {

        StringBuilder reversedStr = new StringBuilder();
        s = s.toLowerCase();
        char[] myCharArray = s.toCharArray();

        for (int i = myCharArray.length - 1; i >= 0; i--) {
            reversedStr.append(myCharArray[i]);
        }

        return (reversedStr.toString()).equals(s);
    }

//        for (int i = 0; i < myCharArray.length / 2; i++) {
//            if (myCharArray[i] == myCharArray[myCharArray.length - 1 - i]) {
//                System.out.println("is a palindrome!");
//                return true;
//            }
//            System.out.println("is NOT a palindrome!");
//            return false;
//        }
//        return false;
//    }
}
