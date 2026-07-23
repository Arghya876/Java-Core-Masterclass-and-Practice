/**
 * 03-strings-and-exception-handling: ExceptionHandlingDemo.java
 * ===============================================================
 * 💡 What is Exception Handling? (Beginner Friendly Guide)
 * --------------------------------------------------------
 * Analogy: Wearing a Bicycle Helmet ⛑️
 * An "Exception" is a runtime crash (like dividing 10 by 0 or accessing array element -1).
 * Instead of letting the program crash abruptly, we wrap risky code in a `try-catch` block
 * to catch errors safely and show helpful user messages!
 */
public class Step02_ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("     Exception Handling Try-Catch Demo   ");
        System.out.println("=========================================");

        // --- Example 1: Handling Division by Zero ---
        try {
            System.out.println("Step 1: Attempting 10 / 0...");
            int result = 10 / 0; // Risky division!
            System.out.println("Result: " + result); // Will not execute
        } catch (ArithmeticException e) {
            System.out.println("❌ Caught Error: Cannot divide a number by zero!");
        } finally {
            System.out.println("🔒 Finally Block: Always runs no matter what!");
        }

        System.out.println("-----------------------------------------");

        // --- Example 2: Handling Array Index Out of Bounds ---
        try {
            int[] numbers = {10, 20, 30};
            System.out.println("Step 2: Accessing element at index 5...");
            System.out.println(numbers[5]); // Risky index!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Caught Error: Array index does not exist!");
        }

        System.out.println("-----------------------------------------");
        System.out.println("🎉 Program finished smoothly without crashing!");
        System.out.println("=========================================");
    }
}
