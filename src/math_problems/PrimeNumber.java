package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
        printAllPrimeNumbers(2, 1000000);
    }

    public static void printAllPrimeNumbers(int a, int b) {
        int countOfPrimeNums;

        for (int i = a; i <= b; i++) {
            countOfPrimeNums = 0;

            for (int j = a + 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    countOfPrimeNums++;
                    break;
                }
            }
            if (countOfPrimeNums == 0)
                System.out.println(i);
        }
    }
}
