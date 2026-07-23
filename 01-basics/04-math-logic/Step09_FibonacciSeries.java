/**
 * 01-java-basics/step-08-math-and-logical-programs: FibonacciSeries.java
 * =======================================================================
 * Core Concepts Demonstrated:
 * 1. Fibonacci Sequence ($F(0)=0, F(1)=1, F(n) = F(n-1) + F(n-2)$).
 * 2. Iterative Generation ($O(N)$ Time, $O(1)$ Space).
 * 3. Recursive Calculation ($O(2^N)$ Time).
 * 4. Memoized / Dynamic Programming approach ($O(N)$ Time, $O(N)$ Space).
 */
public class Step09_FibonacciSeries {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("        Fibonacci Series Masterclass     ");
        System.out.println("=========================================");

        int n = 10; // Number of terms to generate

        // 1. Iterative Fibonacci Generation
        System.out.print("Iterative Fibonacci (First " + n + " terms): ");
        printFibonacciIterative(n);

        // 2. Recursive N-th Fibonacci
        System.out.println("\n\nRecursive " + n + "-th Fibonacci term: " + fibonacciRecursive(n));

        // 3. Memoized DP Fibonacci
        long[] memo = new long[n + 1];
        System.out.println("Memoized DP " + n + "-th Fibonacci term: " + fibonacciMemoized(n, memo));

        System.out.println("=========================================");
    }

    // Iterative approach
    public static void printFibonacciIterative(int count) {
        long first = 0, second = 1;
        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
    }

    // Naive Recursive approach (O(2^N))
    public static long fibonacciRecursive(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Optimized Memoized DP approach (O(N))
    public static long fibonacciMemoized(int n, long[] memo) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        if (memo[n] != 0) {
            return memo[n]; // Return cached result
        }

        memo[n] = fibonacciMemoized(n - 1, memo) + fibonacciMemoized(n - 2, memo);
        return memo[n];
    }
}
