public class FibonacciSequence {

    public static int fibonacci(int n) {
        int ans;

        if (n <= 1){
            return n;
        } else {
            ans = fibonacci(n - 1) + fibonacci(n - 2);
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = 10;

        System.out.print("The " + n +"th term of the Fibonacci sequence is ");

        n = fibonacci(n);

        System.out.println(n + ".");
    }
}
