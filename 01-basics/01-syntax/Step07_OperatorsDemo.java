/**
 * 02-operators-and-control-flow: OperatorsDemo.java
 * ==================================================
 * Core Concepts Demonstrated:
 * 1. Arithmetic Operators (+, -, *, /, %).
 * 2. Increment & Decrement Operators (Prefix vs Postfix).
 * 3. Relational & Logical Operators (Short-circuit &&, ||).
 * 4. Bitwise Operators (&, |, ^, ~, <<, >>).
 * 5. Ternary Conditional Operator (condition ? val1 : val2).
 */
public class Step07_OperatorsDemo {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("       Mastering Java Operators          ");
        System.out.println("=========================================");

        int a = 20;
        int b = 6;

        // --- 1. Arithmetic Operators ---
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b) + " (Integer Division)");
        System.out.println("a % b = " + (a % b) + " (Remainder/Modulus)");

        // --- 2. Prefix vs Postfix Increment/Decrement ---
        System.out.println("\n--- Increment & Decrement Operators ---");
        int x = 5;
        System.out.println("Initial x    : " + x);
        System.out.println("Postfix x++  : " + (x++) + " (Returns then increments)");
        System.out.println("After Postfix: " + x);
        System.out.println("Prefix ++x   : " + (++x) + " (Increments then returns)");

        // --- 3. Relational & Logical Operators ---
        System.out.println("\n--- Relational & Short-Circuit Logical Operators ---");
        boolean cond1 = (a > b);    // true
        boolean cond2 = (b == 0);   // false

        System.out.println("Is a > b?               : " + cond1);
        System.out.println("Logical AND (cond1 && cond2): " + (cond1 && cond2));
        System.out.println("Logical OR  (cond1 || cond2): " + (cond1 || cond2));
        System.out.println("Logical NOT (!cond1)        : " + (!cond1));

        // Short-circuit safety evaluation (second expression ignored if first determines result)
        int divisor = 0;
        boolean safeCheck = (divisor != 0) && (10 / divisor > 1);
        System.out.println("Safe Short-Circuit Evaluation: " + safeCheck);

        // --- 4. Bitwise Operators ---
        System.out.println("\n--- Bitwise Operators ---");
        int n1 = 5;  // Binary: 0101
        int n2 = 3;  // Binary: 0011

        System.out.println("n1 & n2 (Bitwise AND): " + (n1 & n2)); // 0001 = 1
        System.out.println("n1 | n2 (Bitwise OR) : " + (n1 | n2)); // 0111 = 7
        System.out.println("n1 ^ n2 (Bitwise XOR): " + (n1 ^ n2)); // 0110 = 6
        System.out.println("~n1     (Bitwise NOT): " + (~n1));     // -6
        System.out.println("n1 << 1 (Left Shift) : " + (n1 << 1)); // 10 (Multiplies by 2)
        System.out.println("n1 >> 1 (Right Shift): " + (n1 >> 1)); // 2  (Divides by 2)

        // --- 5. Ternary Conditional Operator ---
        System.out.println("\n--- Ternary Operator ---");
        int max = (a > b) ? a : b;
        System.out.println("Max of " + a + " and " + b + " using Ternary: " + max);

        System.out.println("=========================================");
    }
}
