public class FibonacciSequence {

    /**
     * Returns an int that is the nth term of a given number in the Fibonacci Sequence
     * This is a recursive method that calculates the nth term in the Fibonacci Sequence
     *
     * @param n the nth term
     * @return  the nth term in the Fibonacci Sequence
     */
    public static int fibonacci(int n) {

        int ans;

        if (n <= 1){
            return n;
        } else {
            ans = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return ans;
    }

    // The main method
    public static void main(String[] args) {

        int n = 15;

        System.out.print("The " + n +"th term of the Fibonacci sequence is ");

        n = fibonacci(n);

        System.out.println(n + ".");
    }
}
