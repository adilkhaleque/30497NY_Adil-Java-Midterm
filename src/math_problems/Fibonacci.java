package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {
        computeFibonacciSequence(40);
    }

    public static void computeFibonacciSequence(int n) {
        int count = 0;
        int n1 = 0;
        int n2 = 1;

        // <= is 41
        while (count < n) {

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            count += 1;

            System.out.print(n1 + " ");
            //System.out.println(count);
        }
    }
}
