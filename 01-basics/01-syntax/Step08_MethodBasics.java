/**
 * 06-methods-and-scope: MethodBasics.java
 * ========================================
 * Core Concepts Demonstrated:
 * 1. Defining static helper methods.
 * 2. Parameters vs Arguments.
 * 3. Method Return Types (`void` vs non-void).
 * 4. Method Overloading (same name, different parameter lists).
 * 5. Recursive Method calls (Factorial/Fibonacci).
 */
public class Step08_MethodBasics {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("        Java Methods & Overloading       ");
        System.out.println("=========================================");

        // Calling custom void method
        greetUser("Arghya");

        // Calling returning method
        int sumResult = add(15, 25);
        System.out.println("Sum of 15 and 25         : " + sumResult);

        // Calling overloaded methods
        System.out.println("Overloaded Add (3 ints)  : " + add(10, 20, 30));
        System.out.println("Overloaded Add (2 doubles): " + add(5.5, 4.5));

        // Calling recursive method
        int n = 5;
        long fact = factorialRecursive(n);
        System.out.println("Factorial of " + n + " (Recursive): " + fact);

        System.out.println("=========================================");
    }

    // Method 1: Void return type
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Method Execution.");
    }

    // Method 2: Integer return type with 2 params
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method 3: Overloaded method (3 integer params)
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Method 4: Overloaded method (2 double params)
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method 5: Recursive method
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
}
