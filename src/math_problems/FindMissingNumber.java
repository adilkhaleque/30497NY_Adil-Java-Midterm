package math_problems;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println(missingNum(array));
    }

    public static int missingNum(int[] numArr) {
        int sum = ((numArr.length + 1) * (numArr.length + 2)) / 2;
        //for (int i = 0; i < numArr.length; i++)
        for (int j : numArr) sum -= j;
        return sum;
    }
}
